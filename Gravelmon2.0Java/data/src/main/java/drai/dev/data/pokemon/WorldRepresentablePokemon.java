package drai.dev.data.pokemon;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.gravelmon.pokemon.attributes.Label;
import org.jetbrains.annotations.*;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;

public abstract class WorldRepresentablePokemon {
    protected File textureDirectory;
    protected File modelFile;
    protected Image placeholderImage;
    protected Image femalePlaceholderImage;
    protected JsonObject modelJSON;
    protected boolean hasSeparateFemaleModel;
    private final SpeciesFileData speciesFileData = new SpeciesFileData();
    private final PosingFileData posingFileData = new PosingFileData();
    private final PosingFileData femalePosingFileData = new PosingFileData();

    protected void processPokemonAssets(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences){
        textureDirectory = findTextureDirectory(abstractPokemon, resourcesDir);
        if(!isModeled()){
            findOrCreatePlaceholderImage(abstractPokemon, resourcesDir, hasGenderDifferences);
            double factor = 96d / getPlaceholderMaxSideSize(abstractPokemon);
            recalculateScales(abstractPokemon, factor);
//            recalculateXYZOffsets(factor);
            posingFileData.animations.add(new AnimationData("profile", List.of(PoseType.PROFILE), List.of("pc_fix"), List.of(), 10));
            posingFileData.animations.add(new AnimationData("portrait", List.of(PoseType.NONE, PoseType.PORTRAIT), List.of("summary_fix"), List.of(), 10));
            ModelJsonWriter.writeModel(abstractPokemon, getPlaceholderImageWidth(abstractPokemon), getPlaceholderImageHeight(abstractPokemon), resourcesDir, false);

            if(femalePlaceholderImage != null) {
//                double femaleSizeFactor = 96d / getFemalePlaceholderMaxSideSize(abstractPokemon);
//                femalePosingFileData.portraitScale *= femaleSizeFactor;
//                femalePosingFileData.profileScale *= femaleSizeFactor;
                femalePosingFileData.animations.add(new AnimationData("profile", List.of(PoseType.PROFILE), List.of("pc_fix"), List.of(), 10));
                femalePosingFileData.animations.add(new AnimationData("portrait", List.of(PoseType.NONE, PoseType.PORTRAIT), List.of("summary_fix"), List.of(), 10));
                ModelJsonWriter.writeModel(abstractPokemon, getFemalePlaceholderImageWidth(abstractPokemon), getFemalePlaceholderImageHeight(abstractPokemon), resourcesDir, true);
            }
        } else {
            abstractPokemon.labels.remove(Label.NOT_MODELED);
            if(abstractPokemon instanceof Pokemon pokemon){
                pokemon.getForms().forEach(pokemonForm -> pokemonForm.getLabels().remove(Label.NOT_MODELED));
            }
        }
        generateSpeciesFileData(abstractPokemon);
        generatePosingFileData(abstractPokemon);
        if(isModeled()) validate(abstractPokemon, resourcesDir, hasGenderDifferences);
    }

    private void recalculateScales(AbstractPokemon abstractPokemon, double factor) {
        abstractPokemon.setBaseScale(abstractPokemon.baseScale * factor);
        double newHitboxWidth = /*Math.min(*/6 / factor/*, 3)*/;
        double newHitboxHeight =  /*Math.min(*/6 / factor/*, 3)*/;
        abstractPokemon.setHitbox(newHitboxWidth, newHitboxHeight);
        var modelSize = getPlaceholderMaxSideSize(abstractPokemon);
        posingFileData.profileScale = 19.5349 * Math.pow(modelSize, -0.9442);
        posingFileData.portraitScale = 18.3558 * Math.pow(modelSize, -0.9805);
        posingFileData.profileCoords.y = 0.2881 * Math.pow(modelSize, 0.2838);
        posingFileData.portraitCoords.y = 0.3582 * Math.pow(modelSize, 0.2354);
//        posingFileData.profileCoords.multiply(profileDiff);
    }

    private void validate(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences) {
        //Species File validation
        var modelName = abstractPokemon.getGame().getCleanName()+"_"+abstractPokemon.getCleanName();
        var modelLocation = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\models\\"+ modelName;
        if(!new File(modelLocation+ ".geo.json").exists()){
            Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation);
        }
        if(hasGenderDifferences || hasSeparateFemaleModel) {
            if(!new File(modelLocation+ "_female.geo.json").exists()){
                Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation);
            }
        };

        //Poser File validation
        var animationFileName = posingFileData.animationFileName + ".animation.json";
        var animationLocation = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\animations\\"+animationFileName;
        if(!new File(animationLocation).exists()){
            Cobblemon.LOGGER.warn("Animation {} does not exist", animationFileName);
        }
        try {
            JsonObject jsonAnimation = (JsonObject) JsonParser.parseReader(new FileReader(animationLocation));
            var animationMap = new HashMap<String, String>();
            jsonAnimation.getAsJsonObject("animations").keySet().forEach(key -> {
                        var splitAnimation = key.replaceAll("animation\\.", "").split("\\.");
                        if(splitAnimation.length == 2){
                            animationMap.put(splitAnimation[1], splitAnimation[0]);
                        }
                    });
            posingFileData.animations.forEach(animationData -> {
                checkAnimationsExists(animationData, animationMap, animationFileName);

            });
        } catch (FileNotFoundException e) {
            Cobblemon.LOGGER.warn("Animation {} is invalid", animationFileName);
        }
    }

    private void checkAnimationsExists(AnimationData animationData, HashMap<String, String> animationMap, String animationFileName) {
        var animations = new ArrayList<>(animationData.animations);
        animations.forEach(animation -> {
            if(animation.contains("q.")) return;
            if(!checkAnimationExists(animationMap, animationFileName, animation)){
                animationData.animations.remove(animation);
            }
        });
        var quirks = new ArrayList<>(animationData.getQuirks());
        quirks.forEach(quirk -> {
            var quirkAnimations = new ArrayList<>(quirk.animations);
            quirkAnimations.forEach(quirkAnimation -> {
                if(!checkAnimationExists(animationMap, animationFileName, quirkAnimation)){
                    quirk.animations.remove(quirkAnimation);
                }
            });
            if(quirk.animations.isEmpty()) animationData.getQuirks().remove(quirk);
        });
    }

    private boolean checkAnimationExists(HashMap<String, String> animationMap, String animationFileName, String animation) {
        if (animation.equalsIgnoreCase("look")){
            if (posingFileData.head == null) return false;
            return true;
        }
        var animationIsPresent = animationMap.containsKey(animation);
//                    boolean b = !animationMap.get(animation).equals(animationFileName);
        if(!animationIsPresent/* || b*/) {
            Cobblemon.LOGGER.warn("Animation {} is not present in {}", animation, animationFileName);
            return false;
        }
        return true;
    }

    private void generateSpeciesFileData(AbstractPokemon abstractPokemon) {
        if(!isModeled()){
            speciesFileData.variations.add(VariationData.fromPokemon(abstractPokemon, List.of()));
        }
    }

    private void generatePosingFileData(AbstractPokemon abstractPokemon) {
        if(posingFileData.animationFileName == null || posingFileData.animationFileName.isEmpty()){
            posingFileData.animationFileName = isModeled() ? abstractPokemon.getCleanName() : "cutout";
        }
    }

    int getPlaceholderImageWidth(AbstractPokemon abstractPokemon) {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+abstractPokemon.getCleanName());
            return 98;
        }
        return placeholderImage.getWidth(null);
    }
    int getPlaceholderImageHeight(AbstractPokemon abstractPokemon) {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+abstractPokemon.getCleanName());
            return 98;
        }
        return placeholderImage.getHeight(null);
    }
    int getPlaceholderMaxSideSize(AbstractPokemon abstractPokemon) {
        if(placeholderImage == null) {
            System.out.println("placeholderImage is null for pokemon "+abstractPokemon.getCleanName());
            return 98;
        }
        return Math.max(getPlaceholderImageHeight(abstractPokemon), getPlaceholderImageWidth(abstractPokemon));
    }
    int getFemalePlaceholderImageWidth(AbstractPokemon abstractPokemon) {
        return femalePlaceholderImage.getWidth(null);
    }
    int getFemalePlaceholderImageHeight(AbstractPokemon abstractPokemon) {
        return femalePlaceholderImage.getHeight(null);
    }
    int getFemalePlaceholderMaxSideSize(AbstractPokemon abstractPokemon) {
        return Math.max(getFemalePlaceholderImageHeight(abstractPokemon), getFemalePlaceholderImageWidth(abstractPokemon));
    }

    private @NotNull File findTextureDirectory(AbstractPokemon abstractPokemon, String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + abstractPokemon.getGame().getName().toLowerCase() + "\\" + abstractPokemon.getCleanName();
        return new File(expectedDir);
    }

    public boolean isModeled() {
        var directoryExists = textureDirectory.exists();
        return textureDirectory != null && directoryExists;
    }

    public void findOrCreatePlaceholderImage(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences){
        String pathname = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + abstractPokemon.getGame().getCleanName() + "\\";
        if(abstractPokemon instanceof Pokemon) {
            if (hasGenderDifferences) {
                abstractPokemon.femalePlaceholderImage = createPlaceholderTextureIfNotExists(abstractPokemon.getCleanName() + "_female.png", pathname);
            }
            abstractPokemon.placeholderImage = createPlaceholderTextureIfNotExists(abstractPokemon.getCleanName() + ".png", pathname);
        } else if (abstractPokemon instanceof PokemonForm pokemonForm){
            if (hasGenderDifferences) {
                abstractPokemon.femalePlaceholderImage = createPlaceholderTextureIfNotExists( pokemonForm.getCleanName()+"_"+pokemonForm.getFormOf().getCleanName() + "_female.png", pathname);
            }
            abstractPokemon.placeholderImage = createPlaceholderTextureIfNotExists(pokemonForm.getCleanName()+"_"+pokemonForm.getFormOf().getCleanName() + ".png", pathname);
        }
    }

    public static BufferedImage createPlaceholderTextureIfNotExists(String filename, String textureDir) {
        File textureLocation = new File(textureDir + filename);
        BufferedImage image = null;
        if (!textureLocation.exists()) {
            image = new BufferedImage(2, 2, 3);
            try {
                Files.createDirectories(new File(textureDir).toPath());
                ImageIO.write(image, "png", textureLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                image = ImageIO.read(textureLocation);
            } catch (IOException e) {
                System.out.println(textureLocation.getAbsolutePath());
                throw new RuntimeException(e);
            }
        }
        return image;
    }

    public void addAnimation(AnimationData animationData){
        posingFileData.animations.add(animationData);
    }

    public File getTextureDirectory() {
        return textureDirectory;
    }

    public File getModelFile() {
        return modelFile;
    }

    public Image getPlaceholderImage() {
        return placeholderImage;
    }

    public Image getFemalePlaceholderImage() {
        return femalePlaceholderImage;
    }

    public JsonObject getModelJSON() {
        return modelJSON;
    }

    public SpeciesFileData getSpeciesFileData() {
        return speciesFileData;
    }

    public PosingFileData getPosingFileData(boolean isFemaleModel) {
        if(isFemaleModel) return femalePosingFileData;
        return getPosingFileData();
    }

    public PosingFileData getPosingFileData() {
        return posingFileData;
    }

    public String getPlaceholderModelName(AbstractPokemon abstractPokemon, boolean isFemaleModel) {
        if(isFemaleModel) return getFemalePlaceholderModelName(abstractPokemon);
        return "cutout_gravelmon_" + getPlaceholderImageWidth(abstractPokemon) +"_by_" + getPlaceholderImageHeight(abstractPokemon);
    }

    public String getFemalePlaceholderModelName(AbstractPokemon abstractPokemon) {
        return "cutout_gravelmon_" + getFemalePlaceholderImageWidth(abstractPokemon) +"_by_" + getFemalePlaceholderImageHeight(abstractPokemon);
    }
}
