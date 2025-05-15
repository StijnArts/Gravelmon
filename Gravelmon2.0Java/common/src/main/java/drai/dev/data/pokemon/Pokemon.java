package drai.dev.data.pokemon;

import drai.dev.data.attributes.*;
import drai.dev.data.jsonwriters.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import kotlin.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.util.*;
import java.util.stream.*;

import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;

public class Pokemon extends AbstractPokemon {

    boolean isShoulderMountable = false;

    private int pokedexNumber;
    private final List<PokemonForm> forms;
    private Boolean isNew = true;
    private boolean nameDifferentInLangFile;
    private String langFileName;
    private String shoulderMountEffect;
    @Nullable
    private Aspect formAdditionAspect;
    private String additionalFormKey;

    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(originalPokemon, aspect, name, primaryType, null, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, List.of(
                new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
        ), baseScale, portraitScale, forms);
    }


    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(originalPokemon, aspect, name, primaryType, null, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, pokemonSpawnData, baseScale, portraitScale, forms);
    }

    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(originalPokemon, aspect, name, primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, List.of(
                new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
        ), baseScale, portraitScale, forms);
    }

    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Type secondaryType, Stats stats,
                   List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio,
                   int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups,
                   List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount,
                   List<ItemDrop> drops, List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship,
                eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, pokemonSpawnData, baseScale, portraitScale, forms);
        this.formAdditionAspect = aspect;
        addAdditionalForm(originalPokemon, this);
    }

    public Pokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities,
                   Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio,
                   int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles,
                   List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops,
                   SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel,
                   double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions,
                   List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield,
                experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops,
                List.of(
                        new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
                ),
                baseScale, portraitScale, forms);
    }

    public Pokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities,
                   Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio,
                   int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles,
                   List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops,
                   List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield,
                experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops,
                pokemonSpawnData,
                baseScale, portraitScale, forms);
        this.secondaryType = secondaryType;
    }



    public Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height,
                   int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                   int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> entries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext,
                   SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, entries, evolutions, learnSet, labels, dropAmount, drops, List.of(
                new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
        ), forms);
    }

    public Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height,
                   int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                   int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> entries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, entries, evolutions, learnSet, labels, dropAmount, drops, pokemonSpawnData, forms);
        DexCounter.incrementDexCounter();
    }




    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups,
                   List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(dexNo, name, primaryType,secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops,List.of(
                new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
        ), baseScale, portraitScale, forms);
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops,
                   List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(dexNo, name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield,
                experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, pokemonSpawnData, baseScale, portraitScale, forms);
        this.secondaryType = secondaryType;
    }

    public Pokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height,
                   int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                   int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> entries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext,
                   SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(dexNo, name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, entries,
                evolutions, learnSet, labels, dropAmount, drops, List.of(
                        new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
                ), baseScale, portraitScale, forms);
    }

    public Pokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height,
                   int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                   int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> entries, List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, List<PokemonSpawnData> pokemonSpawnData, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, entries, evolutions, learnSet, labels, dropAmount, drops,
                pokemonSpawnData, forms);
        DexCounter.setDexCounter(dexNo);
        pokedexNumber = dexNo;
        DexCounter.incrementDexCounter();
    }

    private Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height,
                    int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                    int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> entries, List<EvolutionEntry> evolutions,
                    List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, List<PokemonSpawnData> pokemonSpawnData, List<PokemonForm> forms) {
        super(name, stats, primaryType, abilities, hiddenAbility, catchRate, maleRatio, baseExperienceYield, experienceGroup,
                eggCycles, eggGroups, entries, evolutions, labels, dropAmount, drops, baseFriendship, evYield, learnSet, List.of(), height, weight, pokemonSpawnData);
        this.pokedexNumber = DexCounter.getDexCounter();
        this.forms = forms;
        POKEMON_REGISTRY.put(this.name.toLowerCase().replaceAll("\\W", ""), this);
        forms.forEach(form -> form.setFormOf(this));
    }

    public static Set<String> getKeysByValue(Map<String, List<Pokemon>> map, Pokemon value) {
        return map.entrySet().stream().filter(entry -> entry.getValue().contains(value)).map(Map.Entry::getKey).collect(Collectors.toSet());
    }

    public static void addStaticAdditionalEvolution(String from, EvolutionEntry evolutionEntry) {
        if (from.contains(" ")) {
            return;
        }
        var forms = ADDITIONAL_EVOLUTIONS.computeIfAbsent(from, k -> new ArrayList<>());
        forms.add(evolutionEntry);
//        this.additionalEvolutions.computeIfAbsent(from, k -> new ArrayList<>()).add(evolutionEntry);
    }

    public void addAdditionalEvolution(String from, EvolutionEntry evolutionEntry) {
        if (from.contains(" ")) {
            return;
        }
        var forms = ADDITIONAL_EVOLUTIONS.computeIfAbsent(from, k -> new ArrayList<>());
        forms.add(evolutionEntry);
//        this.additionalEvolutions.computeIfAbsent(from, k -> new ArrayList<>()).add(evolutionEntry);
    }

    private void addAdditionalForm(String originalPokemon, Pokemon pokemon) {
        var key = originalPokemon.toLowerCase();
        if (key.isBlank()) {
            key = getClass().getSimpleName().toLowerCase().replaceAll(pokemon.getAdditionalAspect().name().toLowerCase(), "");
        }
        String className = getClass().getSimpleName();
        for (int i = 0; i < 20; i++) {
            String numberAsWord = EnglishNumberToWords.convert(i);
            if (className.endsWith(StringUtils.capitalize(numberAsWord.toLowerCase()))) {
                key = key.substring(0, key.length() - numberAsWord.length());
                break;
            }
        }
        var forms = ADDITIONAL_FORMS.computeIfAbsent(key.toLowerCase(), k -> new ArrayList<>());
        additionalFormKey = key;
        forms.add(pokemon);
        ADDITIONAL_SPECIES_ASPECTS.add(pokemon.getAdditionalAspect());
//        POKEMON_REGISTRY.remove(this.name.toLowerCase().replaceAll("\\W",""));
    }

    public void processAssets(String resourcesDir){
            processPokemonAssets(resourcesDir, hasGenderDifferences);
            forms.forEach(form -> form.processPokemonAssets(resourcesDir, hasGenderDifferences));
    }

    protected static void addAdditionalPreEvolution(String from, String result) {
        ADDITIONAL_PRE_EVOLUTIONS.put(result, from);
    }

    public void setShoulderMountable(boolean shoulderMountable) {
        isShoulderMountable = shoulderMountable;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setHasGenderDifferences(boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }
    public String getCleanName() {
        return GravelmonUtils.getCleanName(name);
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    public Boolean isShoulderMountable() {
        return isShoulderMountable;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public List<PokemonForm> getForms() {
        return forms;
    }

    public Boolean cannotDynamax() {
        return cannotDynamax;
    }

    public boolean isNew() {
        return isNew;
    }

    public boolean hasGenderDifferences() {
        return hasGenderDifferences;
    }

    public void setNameDifferentInLangFile(boolean nameDifferentInLangFile) {
        this.nameDifferentInLangFile = nameDifferentInLangFile;
    }

    public boolean isNameDifferentInLangFile() {
        return nameDifferentInLangFile;
    }

    public void setLangFileName(String langFileName) {
//        this.langFileName = StringUtils.capitalize(langFileName);
    }

    public String getLangFileName() {
        return langFileName;
    }

    public String getShoulderMountEffect() {
        return shoulderMountEffect;
    }

    public Aspect getAdditionalAspect() {
        return formAdditionAspect;
    }

    public Pokemon setPreferredBlocks(String... preferredBlocks) {
        this.spawnData.stream().filter(pokemonSpawnData -> pokemonSpawnData.getSpawnContext() != SpawnContext.FISHING).forEach(pokemonSpawnData -> pokemonSpawnData.getPreferredBlocks().addAll(List.of(preferredBlocks)));
        return this;
    }

    public Pokemon createFishingSpawn(SpawnPool spawnPool, int minLevel, int maxLevel, double weight) {
        return createFishingSpawn(spawnPool, minLevel, maxLevel, weight, new ArrayList<>());
    }
    public Pokemon createFishingSpawn(SpawnPool spawnPool, int minLevel, int maxLevel, double weight,
                                      List<SpawnCondition> conditions) {
        return createFishingSpawn(spawnPool, minLevel, maxLevel, weight, conditions, new ArrayList<>());
    }
        public Pokemon createFishingSpawn(SpawnPool spawnPool, int minLevel, int maxLevel, double weight,
                                      List<SpawnCondition> conditions, List<SpawnCondition> antiConditions){
        spawnData.add(new PokemonSpawnData(SpawnContext.FISHING, spawnPool,
                minLevel, maxLevel,
                weight,
                conditions,
                antiConditions, new ArrayList<>(), new ArrayList<>()));
        return this;
    }

    public Pokemon fishingSpawnFromExisting(List<SpawnCondition> additionalConditions){
        var firstSpawnData = spawnData.get(0);
        if (firstSpawnData != null) {
            var conditions = new ArrayList<>(filterConditionsForFishing(firstSpawnData.getSpawnConditions()));
            conditions.addAll(additionalConditions);
            var antiConditions = new ArrayList<>(filterConditionsForFishing(firstSpawnData.getSpawnAntiConditions()));
            createFishingSpawn(firstSpawnData.getSpawnPool(), firstSpawnData.getMinSpawnLevel(), firstSpawnData.getMaxSpawnLevel(), firstSpawnData.getSpawnWeight(), conditions, antiConditions);
        }
        return this;
    }

    private static @NotNull List<SpawnCondition> filterConditionsForFishing(List<SpawnCondition> firstSpawnData) {
        return firstSpawnData
                .stream()
                .filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.BIOMES
                        || spawnCondition.getConditionKind() == SpawnConditionType.MOONPHASE
                        || spawnCondition.getConditionKind() == SpawnConditionType.IS_THUNDERING
                        || spawnCondition.getConditionKind() == SpawnConditionType.TIMERANGE
                        || spawnCondition.getConditionKind() == SpawnConditionType.IS_RAINING).toList();
    }

    public Pokemon fishingSpawnFromExisting(){
        return fishingSpawnFromExisting(List.of());
    }

    protected static void addAdditionalItemDrop(String from, String evolutionItem, Pokemon result) {
        if (evolutionItem.contains("gravelmon")) {
            if (!EVOLUTION_ITEMS.contains(evolutionItem)) {
                EVOLUTION_ITEMS.add(evolutionItem);
            }
        }
        if (!ADDITIONAL_DROPS.containsKey(from)) {
            ADDITIONAL_DROPS.put(from, new ArrayList<>());
        }

        ADDITIONAL_DROPS.get(from).add(new ItemDrop(evolutionItem, 10, 1, 1));
        if (result != null) {
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionItem, 40, 1, 1));
        }
    }
    public String getSpreadsheetName() {
        if (isAnAdditionalForm(this))
            return  getCleanName().toLowerCase().replaceAll(this.getAdditionalAspect().name().toLowerCase(), "");
        return name;
    }

    public List<String> getEvolutionsForPrint() {
        var strings = new ArrayList<String>(this.getEvolutions().stream().map(EvolutionEntry::toString).toList());
//        additionalEvolutions.forEach((key, value)-> value.forEach(evolutionEntry -> {
//            strings.add(evolutionEntry.toString().replaceAll("evolves into "+evolutionEntry.getResult(), "evolves from " + key));
//        }));
        return strings;
    }

    public String getAdditionalFormKey() {
        return additionalFormKey;
    }


    @Override
    public String getTextureName() {
        return getCleanName();
    }
}
