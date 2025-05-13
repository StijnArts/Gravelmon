package drai.dev.data.pokemon;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static drai.dev.gravelmon.pokemon.attributes.Label.*;

public class MegaEvolution extends WorldRepresentablePokemon {
    private Ability ability;
    private String megaName = "mega";
    private Aspect aspect;
    private List<Label> labels;
    private String dexEntry;
    private MegaStonePalette megaStonePalette;

    public MegaEvolution(String name, Type primaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect) {
        super(height);
        this.stats = stats;
        this.ability = ability;
        this.gameName = game;
        this.name = name;
        this.aspect = aspect;
        this.labels = labels;
        this.primaryType = primaryType;
    }

    public MegaEvolution(String name, Type primaryType, Type secondaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect) {
        this(name, primaryType, stats, ability, height, game, labels, aspect);
        this.secondaryType = secondaryType;
    }

    public MegaEvolution addPalette(MegaStonePalette megaStonePalette){
        this.megaStonePalette = megaStonePalette;
        return this;
    }

    public static List<String> getDistinctMegaNames() {
        return GravelmonMegas.MEGA_EVOLUTIONS.values().stream().flatMap(Collection::stream).map(MegaEvolution::getMegaAspect).distinct().collect(Collectors.toList());
    }

    public static List<String> getDistinctMegaNames(String key) {
        return GravelmonMegas.MEGA_EVOLUTIONS.get(key).stream().map(MegaEvolution::getMegaAspect).distinct().collect(Collectors.toList());
    }

    public void processPokemonAssets(String resourcesDir) {
        super.processPokemonAssets(resourcesDir, false);
    }

    @Override
    public String getCleanName() {
        return (name+(getAspect()!=null? "_"+getAspect().getName() : "")+"_"+megaName)
                .toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public String getMegaAspect(){
        return GravelmonUtils.getCleanName((getAspect()!=null? getAspect().getName()+"_" : "")+megaName);
    }

    public String getIndependentMegaAspect(){
        return GravelmonUtils.getCleanName((getAspect()!=null? getAspect().getName()+"_" : "")+"mega");
    }

    public String getNonMegaCleanName(){
        return super.getCleanName();
    }

    protected @NotNull File findTextureDirectory(String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + GravelmonUtils.getCleanName(getGameName()) + "\\" + getNonMegaCleanName() +
                "\\"+megaName;
        return new File(expectedDir);
    }

    @Override
    protected @NotNull String getModelName() {
        return super.getModelName()+"_"+name;
    }

    public Stats getStats() {
        return stats;
    }

    public Ability getAbility() {
        return ability;
    }

    public @Nullable Type getPrimaryType() {
        return primaryType;
    }

    public @Nullable Type getSecondaryType() {
        return secondaryType;
    }

    public int getHeight() {
        return height;
    }

    public String getMegaName() {
        return megaName;
    }

    public void setMegaName(String name) {
        this.megaName = name;
    }

    public String getGameName() {
        return gameName;
    }

    @Override
    public String getSpreadsheetName() {
        return "";
    }

    public Aspect getAspect() {
        return aspect;
    }

    public String getDexEntry() {
        return dexEntry;
    }

    public void setDexEntry(String dexEntry) {
        this.dexEntry = dexEntry;
    }

    public String getLangName() {
        var split = megaName.split("_");
        String suffix = "";
        if(split.length>1){
            suffix = " "+ split[1];
        }
        return "Mega " + StringUtils.capitalize(getName()) + suffix;
    }

    public JsonObject toJson() {
        var fileContents = new JsonObject();
        var name = GravelmonUtils.getCleanName(getMegaAspect());
        fileContents.addProperty("name", name);
        fileContents.addProperty("primaryType", primaryType.getName());
        if(secondaryType != null) fileContents.addProperty("secondaryType", secondaryType.getName());
        fileContents.addProperty("baseScale", getBaseScale());
        fileContents.addProperty("cannotDynamax", true);
        var abilities = new JsonArray();
        abilities.add(ability.getName());
        fileContents.add("abilities", abilities);
        fileContents.add("baseStats", stats.getJsonRepresentation());
        var labels = new JsonArray();
        this.labels.stream().map(Label::getName).forEach(labels::add);
        var instagramLabels = new ArrayList<>(List.of(FORM, NORSE, PALMIA, RAIAN, TRIZOR, AROMA, ELB, FABEL, MAHAL, SAHL, IVRIS, ALDAO, BAGO, BORAZUL, FRA, FERRAN));
        if (instagramLabels.contains(this.labels)) {
            labels.add(INSTAGRAM.getName());
        }
        fileContents.add("labels", labels);
        var pokedex = new JsonArray();
        pokedex.add(dexEntry);
        fileContents.add("pokedex", pokedex);
        fileContents.addProperty("height", height);
//        fileContents.addProperty("weight", weight);
        var aspects = new JsonArray();
        aspects.add(GravelmonUtils.getCleanName(getMegaAspect()));
//        aspects.add(aspect.getName());
        fileContents.add("aspects", aspects);

        return fileContents;

    }

    public String getMegaStoneName(String megaStoneName) {
        var megaId = getMegaName();
        var megaStoneNameForId = megaStoneName;
        if (!megaId.equalsIgnoreCase("mega")) {
            var suffix = megaId.split("_");
            megaStoneNameForId += "_" + suffix[1];
        }

        var aspect = getAspect();
        if (aspect != null) {
            megaStoneNameForId = aspect.name() + "_" + megaStoneNameForId;
        }

        return megaStoneNameForId.toLowerCase();
    }

    public MegaStonePalette getMegaStonePalette() {
        return megaStonePalette;
    }
}
