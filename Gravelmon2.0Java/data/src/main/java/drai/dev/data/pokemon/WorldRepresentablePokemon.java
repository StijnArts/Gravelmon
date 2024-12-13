package drai.dev.data.pokemon;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.gravelmon.*;
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
    protected void processPokemonAssets(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences){
        textureDirectory = findTextureDirectory(abstractPokemon, resourcesDir);
        if(!isModeled()){
            findOrCreatePlaceholderImage(abstractPokemon, resourcesDir, hasGenderDifferences);
            double factor = 96d / getPlaceholderMaxSideSize();
            recalculateScales(abstractPokemon, factor);
//            recalculateXYZOffsets(factor);
            posingFileData.animations.add(new AnimationData("profile", List.of(PoseType.PROFILE), List.of("pc_fix"), List.of(), 10));
            posingFileData.animations.add(new AnimationData("portrait", List.of(PoseType.NONE, PoseType.PORTRAIT), List.of("summary_fix"), List.of(), 10));
            ModelJsonWriter.writeModel(abstractPokemon, getPlaceholderImageHeight(), getPlaceholderImageWidth(), resourcesDir);

            if(femalePlaceholderImage != null) {
                ModelJsonWriter.writeModel(abstractPokemon, getFemalePlaceholderImageHeight(), getFemalePlaceholderImageWidth(), resourcesDir);
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

    private void validate(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences) {
        //Species File validation
        var modelName = abstractPokemon.getGame().getCleanName()+"_"+abstractPokemon.getCleanName();
        var modelLocation = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\models\\"+ modelName;
        if(!new File(modelLocation+ ".geo.json").exists()){
            Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation);
        }
        if(!hasGenderDifferences || !hasSeparateFemaleModel) return;
        if(!new File(modelLocation+ "_female.geo.json").exists()){
            Cobblemon.LOGGER.warn("Model {} does not exist", modelLocation);
        }
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
                        animationMap.put(splitAnimation[1], splitAnimation[0]);
                    });
            posingFileData.animations.forEach(animationData -> {
                animationData.animations.forEach(animation -> {
                    if(!animationMap.containsKey(animation)
                            || !animationMap.get(animation).equals(animationFileName)) {
                        Cobblemon.LOGGER.warn("Animation {} is not present in {}", animation, animationFileName);
                    }
                });
            });
        } catch (FileNotFoundException e) {
            Cobblemon.LOGGER.warn("Animation {} is invalid", animationFileName);
        }
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

    private void recalculateXYZOffsets(double factor) {
        posingFileData.portraitCoords.divide(factor);
        posingFileData.profileCoords.divide(factor);
    }

    private void recalculateScales(AbstractPokemon abstractPokemon, double factor) {
        abstractPokemon.setBaseScale(abstractPokemon.baseScale * factor);
        posingFileData.portraitScale *= factor;
        posingFileData.profileScale *= factor;
    }

    int getPlaceholderImageWidth() {
        return placeholderImage.getWidth(null);
    }
    int getPlaceholderImageHeight() {
        return placeholderImage.getHeight(null);
    }
    int getPlaceholderMaxSideSize() {
        return Math.max(getPlaceholderImageHeight(), getPlaceholderImageWidth());
    }
    int getFemalePlaceholderImageWidth() {
        return femalePlaceholderImage.getWidth(null);
    }
    int getFemalePlaceholderImageHeight() {
        return femalePlaceholderImage.getHeight(null);
    }
    int getFemalePlaceholderMaxSideSize() {
        return Math.max(getFemalePlaceholderImageHeight(), getFemalePlaceholderImageWidth());
    }

    private @NotNull File findTextureDirectory(AbstractPokemon abstractPokemon, String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + abstractPokemon.getGame().getName().toLowerCase() + "\\" + abstractPokemon.getCleanName();
        return new File(expectedDir);
    }

    public boolean isModeled() {
        return textureDirectory != null && textureDirectory.exists();
    }

    public void findOrCreatePlaceholderImage(AbstractPokemon abstractPokemon, String resourcesDir, boolean hasGenderDifferences){
        String pathname = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + abstractPokemon.getGame().getCleanName() + "\\";
        if(abstractPokemon instanceof Pokemon) {
            if (hasGenderDifferences) {
                femalePlaceholderImage = createPlaceholderTextureIfNotExists(abstractPokemon.getCleanName() + "_female.png", pathname);
            }
            placeholderImage = createPlaceholderTextureIfNotExists(abstractPokemon.getCleanName() + ".png", pathname);
        } else if (abstractPokemon instanceof PokemonForm pokemonForm){
            if (hasGenderDifferences) {
                femalePlaceholderImage = createPlaceholderTextureIfNotExists( pokemonForm.getCleanName()+"_"+pokemonForm.getFormOf().getCleanName() + "_female.png", pathname);
            }
            placeholderImage = createPlaceholderTextureIfNotExists(pokemonForm.getCleanName()+"_"+pokemonForm.getFormOf().getCleanName() + ".png", pathname);
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

    public PosingFileData getPosingFileData() {
        return posingFileData;
    }

    public String getPlaceholderModelName() {
        return "cutout_gravelmon_" + getPlaceholderImageWidth() +"_by_" + getPlaceholderImageHeight();
    }

    public String getFemalePlaceholderModelName() {
        return "cutout_gravelmon_" + getFemalePlaceholderImageWidth() +"_by_" + getFemalePlaceholderImageHeight();
    }
}
