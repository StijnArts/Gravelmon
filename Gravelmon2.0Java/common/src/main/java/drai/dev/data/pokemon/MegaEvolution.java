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
import java.util.function.*;
import java.util.stream.*;

import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;
import static drai.dev.gravelmon.pokemon.attributes.Label.*;

public class MegaEvolution extends WorldRepresentablePokemon {
    private String megaName = "mega";
    private @Nullable String aspect;
    private List<Label> labels;
    private String dexEntry;
    private String megaStoneName;
    private MegaStonePalette megaStonePalette;
    public Consumer<MegaEvolution> onProcessResources = megaEvolution -> {};

    public MegaEvolution(String name, Type primaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect) {
        super(height);
        this.stats = stats;
        this.abilities.add(ability);
        this.gameName = game;
        this.name = name;
        if(aspect != null) this.aspect = aspect.getName();
        this.labels = labels;
        this.primaryType = primaryType;
    }

    public MegaEvolution(String name, Type primaryType, Type secondaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable Aspect aspect) {
        this(name, primaryType, stats, ability, height, game, labels, aspect);
        this.secondaryType = secondaryType;
    }

    public MegaEvolution(String name, Type primaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable String aspect) {
        super(height);
        this.stats = stats;
        this.abilities.add(ability);
        this.gameName = game;
        this.name = name;
        this.aspect = aspect;
        this.labels = labels;
        this.primaryType = primaryType;
    }

    public MegaEvolution(String name, Type primaryType, Type secondaryType, Stats stats, Ability ability, int height, String game, List<Label> labels, @Nullable String aspect) {
        this(name, primaryType, stats, ability, height, game, labels, aspect);
        this.secondaryType = secondaryType;
    }

    public MegaEvolution(String name, Type primaryType, Stats stats, Ability ability, int height, String game, List<Label> labels) {
        super(height);
        this.stats = stats;
        this.abilities.add(ability);
        this.gameName = game;
        this.name = name;
        this.aspect = null;
        this.labels = labels;
        this.primaryType = primaryType;
    }

    public MegaEvolution(String name, Type primaryType, Type secondaryType, Stats stats, Ability ability, int height, String game, List<Label> labels) {
        this(name, primaryType, stats, ability, height, game, labels);
        this.secondaryType = secondaryType;
    }

    public static void clean() {
        MEGA_EVOLUTIONS.forEach((key, megas) -> {
            getMegasByAspect(megas).values().stream().filter(list->list.size()>1).forEach(mByA->{
                var megasBySuffix = getMegasBySuffix(mByA);
                megasBySuffix.values().stream().filter(list -> list.size()>1).forEach(list -> {
                    for (var mega : list) {
                        var newSuffix = mega.getGameName().substring(0, 1).toUpperCase();
                        String finalNewSuffix = newSuffix;
                        var anyWouldMatchSuffix = list.stream()
                                .filter(otherMega->otherMega!=mega)
                                .anyMatch(otherMega -> finalNewSuffix.equalsIgnoreCase (otherMega.getGameName().substring(0, 1).toUpperCase()));
                        if (anyWouldMatchSuffix) newSuffix = StringUtils.capitalize(GravelmonUtils.getCleanName(mega.getGameName()));
                        String newMegaName = "mega_" + newSuffix;
                        mega.setMegaName(newMegaName);
                    }
                });
            });
        });
    }

    private static Map<String, List<MegaEvolution>> getMegasByAspect(List<MegaEvolution> megas) {
        return megas.stream().collect(Collectors.groupingBy(mega->mega.getAspect() == null ? "" : mega.getAspect().toLowerCase().replaceAll("_","")));
    }

    private static Map<String, List<MegaEvolution>> getMegasBySuffix(List<MegaEvolution> megas) {
        return megas.stream().collect(Collectors.groupingBy(MegaEvolution::getMegaNameSuffix));
    }

    public MegaEvolution setMegaName(String megaName){
        this.megaName = megaName;
        return this;
    }

    public MegaEvolution setMegaStoneName(String megaStoneName){
        this.megaStoneName = megaStoneName;
        return this;
    }

    public MegaEvolution addPalette(MegaStonePalette megaStonePalette){
        this.megaStonePalette = megaStonePalette;
        return this;
    }

    public static void addMegaEvolution(List<MegaEvolution> megaEvolutions) {
        for (MegaEvolution megaEvolution : megaEvolutions) {
            addMegaEvolution(megaEvolution);
        }
    }

    public static void addMegaEvolution(MegaEvolution... megaEvolutions) {
        addMegaEvolution(Arrays.stream(megaEvolutions).toList());
    }

    public static void addMegaEvolution(MegaEvolution megaEvolution) {
        var key = megaEvolution.getNonMegaCleanName();
        List<MegaEvolution> megas = MEGA_EVOLUTIONS.computeIfAbsent(key, k -> new ArrayList<>());
        megas.add(megaEvolution);
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
    public String getTextureName() {
        return GravelmonUtils.getCleanName(getName() + "_" + GravelmonUtils.getCleanName((getAspect()!=null? getAspect().toLowerCase().replaceAll("_","")+"_" : "")+"mega"));
    }

    @Override
    public String getCleanName() {
        return (name+(getAspect()!=null? "_"+getAspect().toLowerCase().replaceAll("_","") : "")+"_"+megaName)
                .toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public String getMegaAspect(){
        return GravelmonUtils.getCleanName((getAspect()!=null? getAspect().toLowerCase()+"_" : "")+megaName);
    }

    public String getIndependentMegaAspect(){
        return GravelmonUtils.getCleanName((getAspect()!=null? getAspect().toLowerCase()+"_" : "")+megaName);
    }

    public String getNonMegaCleanName(){
        return super.getCleanName();
    }

    @Override
    protected @NotNull File findTextureDirectory(String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + GravelmonUtils.getCleanName(getGameName()) + "\\" + getCleanName() +
                "\\";
        return new File(expectedDir);
    }

    @Override
    protected @NotNull String getModelName() {
        return super.getModelName()+"_mega";
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

    public String getMegaNameSuffix() {
        if(!megaName.contains("_")) return "";
        return megaName.substring(megaName.lastIndexOf("_")+1);
    }

    public String getGameName() {
        return gameName;
    }

    @Override
    public String getSpreadsheetName() {
        return "";
    }

    public @Nullable String getAspect() {
        return aspect;
    }

    public String getDexEntry() {
        return dexEntry;
    }

    public MegaEvolution setDexEntry(String dexEntry) {
        this.dexEntry = dexEntry;
        return this;
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
        fileContents.addProperty("cannotDynamax", false);
        fileContents.addProperty("battleOnly", true);
        var abilities = new JsonArray();
        abilities.add(this.abilities.getFirst().getName());
        fileContents.add("abilities", abilities);
        fileContents.add("baseStats", stats.getJsonRepresentation());
        var labels = new JsonArray();
        this.labels.stream().map(Label::getName).forEach(labels::add);
        var instagramLabels = new ArrayList<>(List.of(FORM, NORSE, PALMIA, RAIAN, TRIZOR, AROMA, ELB, FABEL, MAHAL, SAHL, IVRIS, ALDAO, BAGO, BORAZUL, FRA, FERRAN));
        if (instagramLabels.stream().anyMatch(label->this.labels.contains(label))) {
            labels.add(INSTAGRAM.getName());
        }
        if(!this.isModeled()) labels.add("not_modeled");
        fileContents.add("labels", labels);
        if(dexEntry!=null){
            var pokedex = new JsonArray();
            pokedex.add(dexEntry);
            fileContents.add("pokedex", pokedex);
        }
        fileContents.addProperty("height", height);
//        fileContents.addProperty("weight", weight);
        var aspects = new JsonArray();
        aspects.add(GravelmonUtils.getCleanName(getMegaAspect()));
//        aspects.add(aspect.getName());
        fileContents.add("aspects", aspects);

        return fileContents;

    }

    public String getMegaStoneName(@Nullable String megaStoneName) {
        if(this.megaStoneName!=null && !this.megaStoneName.isEmpty()) {
            return this.megaStoneName.replaceAll(" ","_");
        }
        if(megaStoneName==null || megaStoneName.isEmpty()) throw new IllegalArgumentException("megaStoneName cannot be null or empty if MegaEvolution.megaStoneName is null or empty");

        var megaStoneNameForId = megaStoneName + getMegaSuffix();

        var aspect = getAspect();
        if (aspect != null) {
            megaStoneNameForId = aspect + "_" + megaStoneNameForId;
        }
        this.megaStoneName = megaStoneNameForId;
        return megaStoneNameForId.toLowerCase();
    }

    public String getMegaSuffix() {
        if (!getMegaName().equalsIgnoreCase("mega")) {
            var suffix = getMegaName().split("_");
            return "_" + suffix[1];
        }
        return "";
    }

    public MegaStonePalette getMegaStonePalette() {
        return megaStonePalette;
    }
//
//    public MegaEvolution setAbility(Ability ability) {
//        this.ability = ability;
//        return this;
//    }
//
//    public MegaEvolution setStats(Stats stats) {
//        this.stats = stats;
//        return this;
//    }
//
//    public MegaEvolution setHeight(int height){
//        this.height = height;
//        return this;
//    }
//
//    public MegaEvolution setTypes(Type primaryType, Type secondaryType) {
//        this.primaryType = primaryType;
//        this.secondaryType = secondaryType;
//        return this;
//    }
//
//    public MegaEvolution setAspect(Aspect aspect) {
//        this.aspect = aspect.name();
//        return this;
//    }
//
//    public MegaEvolution setAspect(String aspect) {
//        this.aspect = aspect;
//        return this;
//    }
//
//    public MegaEvolution megaFromPokemon(Pokemon pokemon){
//        var name = pokemon.getAdditionalFormKey()==null?pokemon.getCleanName():pokemon.getAdditionalFormKey();
//        return new MegaEvolution(name, pokemon.primaryType, pokemon.secondaryType, pokemon.stats, pokemon.hiddenAbility, pokemon.height, pokemon.gameName, pokemon.labels, pokemon.getAdditionalAspect());
//    }


    public @NotNull MegaEvolution onProcessResources(Consumer<MegaEvolution> worldRepresentablePokemonConsumer) {
        this.onProcessResources = worldRepresentablePokemonConsumer;
        return this;
    }
}
