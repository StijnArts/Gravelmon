package drai.dev.data.pokemon;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import net.minecraft.util.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static drai.dev.data.jsonwriters.data.SpeciesDataJSONWriter.getEvolutions;
import static drai.dev.data.jsonwriters.data.SpeciesDataJSONWriter.getMoves;

public class ArmoredForm extends WorldRepresentablePokemon {
    public static Map<String, ArmoredForm> ARMORED_FORMS = new HashMap<>();
    private List<Ability> abilities = new ArrayList<>();
    private Ability hiddenAbility;
    private Aspect aspect;
    private final List<MoveLearnSetEntry> moveLearnSet = new ArrayList<>();
    private final List<Label> labels = new ArrayList<>();

    private ArmoredForm(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> ability, Ability hiddenAbility, int height,
                       String game, List<Label> labels, @Nullable Aspect aspect, @Nullable List<MoveLearnSetEntry> moveLearnSet) {
        super(height);
        this.stats = stats;
        this.abilities.addAll(ability);
        this.gameName = game;
        this.name = name;
        this.aspect = aspect;
        this.labels.addAll(labels);
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.hiddenAbility = hiddenAbility;
        if(moveLearnSet != null) this.moveLearnSet.addAll(moveLearnSet);

        Pokemon.addStaticAdditionalEvolution(name, new EvolutionEntry(getResult(name, aspect), EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(), List.of(), "minecraft:netherite_helmet"));
    }

    private static @NotNull String getResult(String name, @Nullable Aspect aspect) {
        return name + " armored" + (aspect != null ? " " + aspect.getName().toLowerCase() : "");
    }

    public static void addArmoredForm(String name, Type primaryType, Stats stats, List<Ability> ability, Ability hiddenAbility, int height, String game,
                                      List<Label> labels, @Nullable Aspect aspect, @Nullable List<MoveLearnSetEntry> moveLearnSet) {
        var armoredForm = new ArmoredForm(name, primaryType, null, stats, ability, hiddenAbility, height, game, labels, aspect, moveLearnSet);
        ARMORED_FORMS.put(name, armoredForm);
    }

    public static void addArmoredForm(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> ability, Ability hiddenAbility, int height,
                                      String game, List<Label> labels, @Nullable Aspect aspect, @Nullable List<MoveLearnSetEntry> moveLearnSet) {
        var armoredForm = new ArmoredForm(name, primaryType, secondaryType, stats, ability, hiddenAbility, height, game, labels, aspect, moveLearnSet);
        ARMORED_FORMS.put(name, armoredForm);
    }

    public static List<String> getDistinctArmorNames() {
        return GravelmonMegas.MEGA_EVOLUTIONS.values().stream().flatMap(Collection::stream).map(MegaEvolution::getMegaAspect).distinct().collect(Collectors.toList());
    }

    @Override
    public String getCleanName() {
        return name;
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    @Override
    public String getSpreadsheetName() {
        return StringUtils.capitalize(getAspectName().replaceAll("_", " "));
    }

    @Override
    public String getTextureName() {
        return getAspectName().replaceAll("_", "")+getCleanName();
    }

    @Override
    public String getBasePokemon() {
        return name;
    }

    @Override
    protected @NotNull File findTextureDirectory(String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + GravelmonUtils.getCleanName(getGameName()) + "\\" + getCleanName()+"_"+getAspectName();
        return new File(expectedDir);
    }

    @Override
    protected @NotNull String getModelName() {
        return super.getModelName()+"_"+getAspectName();
    }

    public String getAspectName() {
        var aspectName = "armored";
        if(aspect != null) aspectName+="_"+aspect.getName();
        return aspectName;
    }

    public JsonObject toJson() {
        var fileContents = new JsonObject();
        var name = GravelmonUtils.getCleanName(getAspectName());
        fileContents.addProperty("name", name);
        fileContents.addProperty("primaryType", primaryType.getName());
        if(secondaryType != null) fileContents.addProperty("secondaryType", secondaryType.getName());
        fileContents.addProperty("baseScale", getBaseScale());
        fileContents.addProperty("cannotDynamax", true);
        if(!abilities.isEmpty()){
            var abilities = new JsonArray();
            int abilityCount = 0;
            for (Ability ability : this.abilities) {
                if (ability.isImplemented()) {
                    abilities.add(ability.getName());
                    abilityCount++;
                }
            }
            if (abilityCount == 0) {
                abilities.add(Ability.KEEN_EYE.getName());
            }
            if (hiddenAbility != null && hiddenAbility.isImplemented()) {
                abilities.add("h:" + hiddenAbility.getName());
            }
            fileContents.add("abilities", abilities);
        }
        fileContents.add("baseStats", stats.getJsonRepresentation());
        fileContents.add("evolutions", getEvolutions(List.of(new EvolutionEntry(name, EvolutionType.LEVEL_UP, List.of(), List.of())),getResult(name, aspect)));
        if(!moveLearnSet.isEmpty()) fileContents.add("moves", getMoves(moveLearnSet));
        var labels = new JsonArray();
        this.labels.stream().map(Label::getName).forEach(labels::add);
//        var instagramLabels = new ArrayList<>(List.of(FORM, NORSE, PALMIA, RAIAN, TRIZOR, AROMA, ELB, FABEL, MAHAL, SAHL, IVRIS, ALDAO, BAGO, BORAZUL, FRA, FERRAN));
//        if (instagramLabels.contains(this.labels)) {
//            labels.add(INSTAGRAM.getName());
//        }
        fileContents.add("labels", labels);
        fileContents.addProperty("height", height);
//        fileContents.addProperty("weight", weight);
        var aspects = new JsonArray();
        aspects.add(GravelmonUtils.getCleanName(getAspectName()));
//        aspects.add(aspect.getName());
        fileContents.add("aspects", aspects);

        return fileContents;

    }

    public void processPokemonAssets(String resourcesDir) {
        super.processPokemonAssets(resourcesDir, false);
    }
}
