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
    private Ability ability;
    private String megaName = "mega";
    private Aspect aspect;
    private List<Label> labels;
    private String dexEntry;
    private String megaStoneName;
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
        return megas.stream().collect(Collectors.groupingBy(mega->mega.getAspect() == null ? "" : mega.getAspect().getName()));
    }

    private static Map<String, List<MegaEvolution>> getMegasBySuffix(List<MegaEvolution> megas) {
        return megas.stream().collect(Collectors.groupingBy(MegaEvolution::getMegaNameSuffix));
    }

    public MegaEvolution setMegaName(String megaName){
        this.megaName = megaName;
        return this;
    }

    public MegaEvolution setMegaStoneName(String megaStoneName){
        this.megaStoneName = this.megaStoneName;
        return this;
    }

    public MegaEvolution addPalette(MegaStonePalette megaStonePalette){
        this.megaStonePalette = megaStonePalette;
        return this;
    }

    public static void addMegaEvolution(List<MegaEvolution> megaEvolutions) {
        for (int i = 0; i < megaEvolutions.size(); i++) {
            addMegaEvolution(megaEvolutions.get(i));
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
        return GravelmonUtils.getCleanName(getName() + "_" + GravelmonUtils.getCleanName((getAspect()!=null? getAspect().getName()+"_" : "")+"mega"));
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
        return GravelmonUtils.getCleanName((getAspect()!=null? getAspect().getName()+"_" : "")+megaName);
    }

    public String getNonMegaCleanName(){
        return super.getCleanName();
    }

    @Override
    protected @NotNull File findTextureDirectory(String resourcesDir){
        var expectedDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\" + GravelmonUtils.getCleanName(getGameName()) + "\\" + getNonMegaCleanName() +
                "\\";
        return new File(expectedDir);
    }

    @Override
    protected @NotNull String getModelName() {
        return super.getModelName()+"_mega";
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
        if(this.megaStoneName!=null && !this.megaStoneName.isEmpty()) return this.megaStoneName;

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
