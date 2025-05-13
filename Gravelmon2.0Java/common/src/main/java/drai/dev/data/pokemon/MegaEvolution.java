package drai.dev.data.pokemon;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static drai.dev.gravelmon.pokemon.attributes.Label.*;

public class MegaEvolution extends WorldRepresentablePokemon {
    private Stats stats;
    private Ability ability;
    @Nullable
    private Type primaryType;
    @Nullable
    private Type secondaryType;
    private String megaName = "mega";
    private Aspect aspect;
    private List<Label> labels;
    private String dexEntry;
//    private int weight;

    public MegaEvolution(String name, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect) {
        super(height);
        this.stats = stats;
        this.ability = ability;
        this.gameName = game;
        this.name = name;
        this.aspect = aspect;
        this.labels = labels;
    }

    public MegaEvolution(String name, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect, Type primaryType) {
        this(name, stats, ability, height, game, labels, aspect);
        this.primaryType = primaryType;
    }

    public MegaEvolution(String name, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect, Type primaryType, Type secondaryType) {
        this(name, stats, ability, height, game, labels, aspect, primaryType);
        this.secondaryType = secondaryType;
    }

    public static List<String> getDistinctMegaNames() {
        return AbstractPokemon.MEGA_EVOLUTIONS.values().stream().flatMap(Collection::stream).map(MegaEvolution::getMegaName).distinct().collect(Collectors.toList());
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
        var name = GravelmonUtils.getCleanName(getLangName());
        fileContents.addProperty("name", name);
        if(primaryType!=null) fileContents.addProperty("primaryType", primaryType.getName());
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
        aspects.add(GravelmonUtils.getCleanName(megaName));
        aspects.add(aspect.getName());
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
}
