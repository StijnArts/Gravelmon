package drai.dev.data.pokemon;

import com.cobblemon.mod.common.api.spawning.*;
import drai.dev.data.*;
import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.sql.*;
import java.util.*;
import java.util.stream.*;

public class Pokemon {
    private static String pokemonThatEvolveIntoThemselves = "Encountered pokemon that evolve into Themselves:";
    public static Map<String, Pokemon> POKEMON_REGISTRY = new HashMap<>();
    public static Map<String, List<Pokemon>> ADDITIONAL_FORMS = new HashMap<>();
    public static Map<String, List<EvolutionEntry>> ADDITIONAL_EVOLUTIONS = new HashMap<>();
    public static Map<String, List<ItemDrop>> ADDITIONAL_DROPS = new HashMap<>();
    public static Map<String, String> ADDITIONAL_PRE_EVOLUTIONS = new HashMap<>();
    public static List<Pokemon> FOSSIL_POKEMON = new ArrayList<>();
    String name;
    Stats stats;
    Type primaryType;
    Type secondaryType;
    List<Ability> abilities;
    Ability hiddenAbility;
    int catchRate;
    double maleRatio;
    boolean isShoulderMountable = false;
    private int baseExperienceYield;
    ExperienceGroup experienceGroup;
    int eggCycles;
    List<EggGroup> eggGroups;
    int dropAmount;
    List<ItemDrop> drops;
    private int pokedexNumber;
    private final List<PokemonForm> forms;
    private List<MoveLearnSetEntry> learnSet;
    private final List<Label> labels;
    private final List<String> dexEntries;
    private String preEvolution;
    private List<EvolutionEntry> evolutions = new ArrayList<>();
    private final int baseFriendship;
    private final Stats evYield;
    private final int height;
    private final int weight;
    private Boolean cannotDynamax = false;
    private Boolean isNew = true;
    private boolean hasGenderDifferences = false;
    private final List<PokemonSpawnData> spawnData = new ArrayList<>();
    private Boolean canFly = false;
    private int lightLevelMinSleep = 0;
    private int lightLevelMaxSleep = 6;
    private double swimSpeed = 0.1;
    private double wanderChance = 1;
    private Boolean canSleep = true;
    private Boolean canSwim = true;
    private Boolean canLookAround = true;
    private Boolean willSleepOnBed = false;
    private Boolean canBreathUnderwater = false;
    private Boolean canWalk = true;
    private Boolean canWalkOnWater = false;
    private Boolean avoidsLand = false;
    private double baseScale;
    private final double portraitScale;
    private double portraitTranslationX = 0;
    private double portraitTranslationY = 1.8;
    private double portraitTranslationZ = 0;
    private boolean nameDifferentInLangFile;
    private String langFileName;
    private double hitboxWidth = 1.0;
    private double hitboxHeight = 1.0;
    private String shoulderMountEffect;
    private boolean modeled = false;
    private double profileTranslationZ = 0;
    private double profileTranslationY = 1;
    private double profileScale = 0.001;
    private double profileTranslationX = 0;
    @Nullable
    private Aspect formAdditionAspect;
    private Game game;
    private boolean usesBigModel = false;
    private List<String> preferredBlocks = new ArrayList<>();

    public Pokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        this.secondaryType = secondaryType;
    }

    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        this.formAdditionAspect = aspect;
        addAdditionalForm(originalPokemon, this);
    }


    protected static void addAdditionalEvolution(String from, EvolutionEntry evolutionEntry) {
        if (from.contains(" ")) {
            return;
        }
        var forms = ADDITIONAL_EVOLUTIONS.computeIfAbsent(from, k -> new ArrayList<>());
        forms.add(evolutionEntry);
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
        forms.add(pokemon);
//        POKEMON_REGISTRY.remove(this.name.toLowerCase().replaceAll("\\W",""));
    }

    public Pokemon(String originalPokemon, Aspect aspect, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        this.formAdditionAspect = aspect;
        addAdditionalForm(originalPokemon, this);
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(dexNo, name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        this.secondaryType = secondaryType;
    }

    public Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, forms);
        GravelmonJsonGenerator.incrementDexCounter();
    }

    public Pokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        this(name, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, forms);
        GravelmonJsonGenerator.setDexCounter(dexNo);
        pokedexNumber = dexNo;
        GravelmonJsonGenerator.incrementDexCounter();
    }

    private Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, List<PokemonForm> forms) {
        this.name = getClass().getSimpleName();
        this.stats = stats;
        this.primaryType = primaryType;
        this.secondaryType = null;
        this.abilities = new ArrayList<>();
        this.abilities.addAll(abilities);
        if (this.abilities.size() > 2) {
            this.abilities.remove(2);
        }
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield == 0 ? 60 : baseExperienceYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups = eggGroups;
        this.dropAmount = dropAmount;
        this.drops = new ArrayList<>();
        this.pokedexNumber = GravelmonJsonGenerator.getDexCounter();
        this.forms = forms;
        this.learnSet = learnSet;
        this.labels = new ArrayList<>(labels);
        this.labels.add(Label.NOT_MODELED);
        this.dexEntries = dexEntries;
        this.evolutions.addAll(evolutions);
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.height = height;
        this.weight = weight;
        this.spawnData.add(new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets));
        this.baseScale = Math.max((double) height / 10 / 6, 0.1);
        this.hitboxWidth = 6;
        this.hitboxHeight = 6;
        this.portraitScale = 0.3;
        POKEMON_REGISTRY.put(this.name.toLowerCase().replaceAll("\\W", ""), this);
    }

    public static Set<String> getKeysByValue(Map<String, List<Pokemon>> map, Pokemon value) {
        return map.entrySet().stream().filter(entry -> entry.getValue().contains(value)).map(Map.Entry::getKey).collect(Collectors.toSet());
    }

    public static void postRegistration() {
        List<Pokemon> zeroStatPokemon = new ArrayList<>();
        List<Pokemon> pokemonWithNoPreferredBlocks = new ArrayList<>();
        var evaluatedMons = new ArrayList<>();
        StringBuilder pokemonWithZeroCatchrate = new StringBuilder("Pokemon with 0 catch-rate: \n");
        StringBuilder pokemonWithZeroBaseStats = new StringBuilder("Pokemon with 0 Base Stats: \n");
        StringBuilder pokemonWithMoreThanTwoSpawnPresets = new StringBuilder("Pokemon with more than 1 spawn preset: \n");
        var sortedPokemonList = POKEMON_REGISTRY.values().stream().sorted(Comparator.comparing(pokemon -> pokemon.pokedexNumber)).toList();
        for (var pokemon : sortedPokemonList) {
            if (pokemon.getCatchRate() == 0)
                pokemonWithZeroCatchrate.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            for (var spawnData : pokemon.getSpawnData()){
                if (spawnData.spawnPresets().size() > 1) {
                    pokemonWithMoreThanTwoSpawnPresets.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(", being: ");
                    for (var preset : spawnData.spawnPresets()) {
                        pokemonWithMoreThanTwoSpawnPresets.append(preset).append(",");
                    }
                    pokemonWithMoreThanTwoSpawnPresets.append("\n");
                }
            }

            if (pokemon.getEggGroups().isEmpty()) {
                pokemon.eggGroups = new ArrayList<>(pokemon.eggGroups);
                pokemon.eggGroups.add(EggGroup.FIELD);
            }
            if (pokemon.stats.isEmpty()) {
                zeroStatPokemon.add(pokemon);
            }
            if(pokemon.getPreferredBlocks().isEmpty()){
                pokemonWithNoPreferredBlocks.add(pokemon);
            }

            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                Pokemon result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                if (result != null) {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addItemAsDrop(pokemon, evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition")).forEach(entry -> addItemAsDrop(pokemon, entry.getConditionParameter().replace("\"", ""), result));
                    }
                    if (result.getLangFileName() != null) {
                        if (result.getLangFileName().equalsIgnoreCase(pokemon.getName())) continue;
                        if (pokemon.getLangFileName() != null) {
                            if (result.getLangFileName().equalsIgnoreCase(pokemon.getLangFileName())) continue;
                        }
                    } else if (pokemon.getLangFileName() != null) {
                        if (pokemon.getLangFileName().equalsIgnoreCase(result.getName())) continue;
                    }

                    if (evaluatedMons.contains(result)) continue;
                    evaluatedMons.add(result);
                    if (result.getCleanName().equals(pokemon.getCleanName())) {
                        pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ",\n";
                    }

                    if (result.preEvolution != null && Pokemon.isAnAdditionalForm(pokemon)) {
                        continue;
                    }
                    if (!isBasedOnOriginalPokemon(pokemon)) {
                        result.getLabels().add(Label.FAKEMON);
                    }
                    if (Pokemon.isAnAdditionalForm(pokemon)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, pokemon).stream().findFirst();
                        resultName.ifPresent(s -> result.setPreEvolution(s + " form=" + pokemon.getAdditionalAspect().name().toLowerCase()));
                    } else {
                        result.setPreEvolution(pokemon.getCleanName());
                    }
                }
            }
            var evaluatedForms = new ArrayList<>();
            for (PokemonForm form : pokemon.getForms()) {
                if (pokemon.getCatchRate() == 0)
                    pokemonWithZeroCatchrate.append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                if (form.getStats().getTotal() == 0)
                    pokemonWithZeroBaseStats.append(form.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                for (EvolutionEntry evolutionEntry : form.getEvolutions()) {
                    String resultName = evolutionEntry.getResult();

                    PokemonForm result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(resultName)).map(Pokemon::getForms).flatMap(List::stream).filter(pokemonForm -> new HashSet<>(pokemonForm.getAspects()).containsAll(evolutionEntry.getAspects())).findFirst().orElse(null);
                    if (result != null) {
                        if (evolutionEntry.getRequiredContext() != null) {
                            addItemAsDrop(form, evolutionEntry.getRequiredContext(), result);
                        } else {
                            evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition")).forEach(entry -> addItemAsDrop(form, entry.getConditionParameter().replace("\"", ""), result));
                        }


                        if (evaluatedForms.contains(result)) continue;
                        evaluatedForms.add(result);
                        if (result.preEvolution != null) {
                            continue;
                        }
                        if (result.getCleanName().equals(pokemon.getCleanName())) {
                            pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ", Aspect: " + evolutionEntry.getAspects() + ",\n";
                        }
                        if (!isBasedOnOriginalPokemon(pokemon)) {
                            result.getLabels().add(Label.FAKEMON);
                        }
                        String aspect = evolutionEntry.getAspects().stream().findFirst().isEmpty() ? "" : " form=" + evolutionEntry.getAspects().stream().findFirst().get().name();
                        result.setPreEvolution(pokemon.getCleanName() + aspect);
                    }
                }
            }
        }
        System.out.println(pokemonThatEvolveIntoThemselves);
        System.out.println(pokemonWithMoreThanTwoSpawnPresets);
        System.out.println("Evolution Items:");
        for (String item : EVOLUTION_ITEMS) System.out.println(item + ",");

        for (int i = zeroStatPokemon.size() - 1; i > -1; i--) {
            var pokemon = zeroStatPokemon.get(i);
            if (!pokemon.evolutions.isEmpty()) {
                Optional<Pokemon> pokemonToCopy = pokemon.evolutions.stream().map(evolutionEntry -> evolutionEntry.getResult().toLowerCase())
//                            .filter(result -> POKEMON_REGISTRY.containsKey(result))
                            .map(result -> {
                                Pokemon pokemon1 = POKEMON_REGISTRY.get(result);
                                if(pokemon1 == null && result.contains(" ")){
                                    var split = result.split(" ");
                                    pokemon1 = POKEMON_REGISTRY.get(split[1]+split[0]);
                                }
                                return pokemon1;
                            })
                            .filter(Objects::nonNull)
                            .min(Comparator.comparing(pokemon1 -> pokemon1.stats.getTotal()));

                if (pokemonToCopy.isPresent()) {
                    var evolutionStats = pokemonToCopy.get().stats;
                    pokemon.stats = new Stats(evolutionStats, 0.7);
                }
            }
        }

        for (int i = pokemonWithNoPreferredBlocks.size() - 1; i > -1; i--) {
            var pokemon = pokemonWithNoPreferredBlocks.get(i);
            if (!pokemon.evolutions.isEmpty()) {
                Optional<Pokemon> pokemonToCopy = pokemon.evolutions.stream().map(evolutionEntry -> evolutionEntry.getResult().toLowerCase())
//                            .filter(result -> POKEMON_REGISTRY.containsKey(result))
                            .map(result -> {
                                Pokemon pokemon1 = POKEMON_REGISTRY.get(result);
                                if(pokemon1 == null && result.contains(" ")){
                                    var split = result.split(" ");
                                    pokemon1 = POKEMON_REGISTRY.get(split[1]+split[0]);
                                }
                                return pokemon1;
                            })
                            .filter(Objects::nonNull)
                            .min(Comparator.comparing(pokemon1 -> pokemon1.stats.getTotal()));

                pokemonToCopy.ifPresent(value -> pokemon.preferredBlocks = new ArrayList<>(value.getPreferredBlocks()));
            }
        }
        for (var pokemon : sortedPokemonList) {
            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                Pokemon result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                if (result != null) {
                    if (isAnAdditionalForm(result)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, result).stream().findFirst();
                        resultName.ifPresent(s -> evolutionEntry.setResult(s + " " + result.getAdditionalAspect().name().toLowerCase()));
                    }
                } else {
                    ADDITIONAL_PRE_EVOLUTIONS.put(evolutionEntry.getResult().toLowerCase(), pokemon.getCleanName());
                }
            }

            for (var form : pokemon.forms) {
                if (form.getAbilities().contains(form.getHiddenAbility())) {
                    form.setHiddenAbility(null);
                }
                for (EvolutionEntry evolutionEntry : form.getEvolutions()) {
                    Pokemon result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                    if (result != null) {
                        if (isAnAdditionalForm(result)) {
                            var resultName = getKeysByValue(ADDITIONAL_FORMS, result).stream().findFirst();
                            resultName.ifPresent(s -> evolutionEntry.setResult(s + " " + result.getAdditionalAspect().name().toLowerCase()));
                        }
                    }
                }
            }
        }

        for (var pokemon : sortedPokemonList) {
            if (pokemon.baseExperienceYield == 0) {
                pokemon.baseExperienceYield = 512 / (pokemon.stats.getHP() / 255);
            }
            if (pokemon.stats.isEmpty()) {
                pokemonWithZeroBaseStats.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            }
            if (pokemon.getAbilities().isEmpty()) pokemon.getAbilities().add(Ability.KEEN_EYE);
            if (pokemon.getAbilities().contains(pokemon.hiddenAbility)) {
                pokemon.hiddenAbility = null;
            }

            if (Gravelmon.FOSSIL_MAP.containsValue(pokemon.getCleanName()) || Gravelmon.FOSSIL_MAP.containsValue(pokemon.getPreEvolution())) {
                FOSSIL_POKEMON.add(pokemon);
            }

            if (pokemon.getLearnSet().isEmpty() || pokemon.getLearnSet().stream().noneMatch(moveLearnSetEntry -> StringUtils.isNumeric(moveLearnSetEntry.getCondition()))) {
                var newMoveSet = MoveListFiller.resolveMoveList(pokemon);
                newMoveSet.addAll(pokemon.getLearnSet());
                pokemon.setLearnSet(newMoveSet);
            }

            if (0 == pokemon.getCatchRate()) {
                var baseStatTotal = pokemon.getStats().getTotal();
                if (baseStatTotal == 600) {
                    pokemon.setCatchRate(45);
                } else if (baseStatTotal > 570) {
                    pokemon.setCatchRate(3);
                } else {
                    pokemon.setCatchRate(resolveNumber(baseStatTotal));
                }
            }
        }
        System.out.println(pokemonWithZeroBaseStats);

        for (var additionalEvolutionEntrySet : ADDITIONAL_EVOLUTIONS.entrySet()) {
            var pokemon = POKEMON_REGISTRY.get(additionalEvolutionEntrySet.getKey());
            for (var evolutionEntry : additionalEvolutionEntrySet.getValue()) {
                Pokemon result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                if (result == null) continue;
                if (pokemon == null) {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addAdditionalItemDrop(additionalEvolutionEntrySet.getKey(), evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition"))
                                .forEach(entry -> addAdditionalItemDrop(additionalEvolutionEntrySet.getKey(), entry.getConditionParameter().replace("\"", ""), result));
                    }
                } else {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addItemAsDrop(pokemon, evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition"))
                                .forEach(entry -> addItemAsDrop(pokemon, entry.getConditionParameter().replace("\"", ""), result));
                    }

                    if (Pokemon.isAnAdditionalForm(pokemon)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, pokemon).stream().findFirst();
                        resultName.ifPresent(s -> result.setPreEvolution(s + " form=" + pokemon.getAdditionalAspect().name().toLowerCase()));
                    } else {
                        result.setPreEvolution(pokemon.getCleanName());
                    }
                }
            }
        }
    }

    public static int resolveNumber(int inputNumber) {
        // Define the input and output ranges
        int inputMin = 180;
        int inputMax = 570;
        int outputMin = 30;
        int outputMax = 255;

        // Ensure the input number is within the expected range
        if (inputNumber < inputMin) {
            inputNumber = inputMin;
        } else if (inputNumber > inputMax) {
            inputNumber = inputMax;
        }

        // Calculate the output using linear interpolation
        double outputNumber = outputMax - ((double) (inputNumber - inputMin) / (inputMax - inputMin)) * (outputMax - outputMin);

        return (int) Math.round(outputNumber);
    }

    private void setCatchRate(int i) {
        catchRate = i;
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

    protected static void addAdditionalPreEvolution(String from, String result) {
        ADDITIONAL_PRE_EVOLUTIONS.put(result, from);
    }

    public static List<String> EVOLUTION_ITEMS = new ArrayList<>();

    private static void addItemAsDrop(PokemonForm from, String evolutionEntry, PokemonForm result) {
        if (evolutionEntry.contains("gravelmon")) {
            if (!EVOLUTION_ITEMS.contains(evolutionEntry)) {
                EVOLUTION_ITEMS.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry, 40, 1, 1));
            from.setDropAmount(1);
            from.getDrops().add(new ItemDrop(evolutionEntry, 10, 1, 1));
        }
    }

    protected static void addItemAsDrop(Pokemon from, String evolutionEntry, Pokemon result) {
        if (evolutionEntry.contains("gravelmon")) {
            if (!EVOLUTION_ITEMS.contains(evolutionEntry)) {
                EVOLUTION_ITEMS.add(evolutionEntry);
            }
            result.setDropAmount(1);
            result.getDrops().add(new ItemDrop(evolutionEntry, 40, 1, 1));
            from.setDropAmount(1);
            from.getDrops().add(new ItemDrop(evolutionEntry, 10, 1, 1));
        }
    }

    public static boolean isAnAdditionalForm(Pokemon pokemon) {
        var result = pokemon.getAdditionalAspect() != null;
        return result;
    }

    private void setDropAmount(int i) {
        dropAmount = i;
    }

    private static boolean isBasedOnOriginalPokemon(Pokemon pokemon) {
        boolean isEvoOfAPreviousPokemon = false;
        for (Label label : pokemon.labels) {
            String generationLabel = "gen";
            for (int i = 1; i < 10; i++) {
                if (label.getName().equalsIgnoreCase(generationLabel + i)) {
                    isEvoOfAPreviousPokemon = true;
                    break;
                }
            }
        }
        return isEvoOfAPreviousPokemon;
    }

    protected void setPreEvolution(String cleanName) {
        if (cleanName.equalsIgnoreCase("eevee")) {
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
    }

    public void setShoulderMountable(boolean shoulderMountable) {
        isShoulderMountable = shoulderMountable;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setCanSleep(Boolean canSleep) {
        this.canSleep = canSleep;
    }

    public void setCanSwim(Boolean canSwim) {
        this.canSwim = canSwim;
    }

    public void setCanLookAround(Boolean canLookAround) {
        this.canLookAround = canLookAround;
    }

    public void setAvoidsLand(Boolean avoidsLand) {
        this.avoidsLand = avoidsLand;
    }

    public void setWillSleepOnBed(Boolean willSleepOnBed) {
        this.willSleepOnBed = willSleepOnBed;
    }

    public void setCanBreathUnderwater(Boolean canBreathUnderwater) {
        this.canBreathUnderwater = canBreathUnderwater;
    }

    public void setCanWalk(Boolean canWalk) {
        this.canWalk = canWalk;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public void setCannotDynamax(Boolean cannotDynamax) {
        this.cannotDynamax = cannotDynamax;
    }

    public void setHasGenderDifferences(boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public String getName() {
        return name;
    }

    public String getCleanName() {
        return GravelmonUtils.getCleanName(name);
    }

    public Stats getStats() {
        return stats;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public Boolean isShoulderMountable() {
        return isShoulderMountable;
    }

    public int getBaseExperienceYield() {
        return baseExperienceYield;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability getHiddenAbility() {
        return hiddenAbility;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public double getMaleRatio() {
        return maleRatio;
    }

    public ExperienceGroup getExperienceGroup() {
        return experienceGroup;
    }

    public int getEggCycles() {
        return eggCycles;
    }

    public List<EggGroup> getEggGroups() {
        return eggGroups;
    }

    public int getDropAmount() {
        return dropAmount;
    }

    public List<ItemDrop> getDrops() {
        return drops;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public List<PokemonForm> getForms() {
        return forms;
    }

    public List<MoveLearnSetEntry> getLearnSet() {
        return learnSet;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<EvolutionEntry> getEvolutions() {
        return evolutions;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public Stats getEvYield() {
        return evYield;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
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

    public Boolean canFly() {
        return canFly;
    }

    public Boolean canSleep() {
        return canSleep;
    }

    public Boolean willSleepOnBed() {
        return willSleepOnBed;
    }

    public int getLightLevelMinSleep() {
        return lightLevelMinSleep;
    }

    public void setLightLevelMinSleep(int lightLevelMinSleep) {
        this.lightLevelMinSleep = lightLevelMinSleep;
    }

    public int getLightLevelMaxSleep() {
        return lightLevelMaxSleep;
    }

    public void setLightLevelMaxSleep(int lightLevelMaxSleep) {
        this.lightLevelMaxSleep = lightLevelMaxSleep;
    }

    public Boolean canLookAround() {
        return canLookAround;
    }

    public Boolean canWalk() {
        return canWalk;
    }

    public Boolean avoidsLand() {
        return avoidsLand;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Boolean canSwim() {
        return canSwim;
    }

    public Boolean canBreathUnderwater() {
        return canBreathUnderwater;
    }

    public double getWanderChance() {
        return wanderChance;
    }

    public void setWanderChance(double wanderChance) {
        this.wanderChance = wanderChance;
    }

    public double getBaseScale() {
        return baseScale;
    }

    public double getPortraitScale() {
        return portraitScale;
    }

    public double getPortraitTranslationX() {
        return portraitTranslationX;
    }

    public double getPortraitTranslationY() {
        return portraitTranslationY;
    }

    public double getPortraitTranslationZ() {
        return portraitTranslationZ;
    }

    public void setPortraitTranslationX(double portraitTranslationX) {
        this.portraitTranslationX = portraitTranslationX;
    }

    public void setPortraitTranslationY(double portraitTranslationY) {
        this.portraitTranslationY = portraitTranslationY;
    }

    public void setPortraitTranslationZ(double portraitTranslationZ) {
        this.portraitTranslationZ = portraitTranslationZ;
    }

    protected void setPortraitXYZ(double x, double y, double z) {
        this.setPortraitTranslationX(x);
        this.setPortraitTranslationY(y);
        this.setPortraitTranslationZ(z);
    }

    public void setNameDifferentInLangFile(boolean nameDifferentInLangFile) {
        this.nameDifferentInLangFile = nameDifferentInLangFile;
    }

    public boolean isNameDifferentInLangFile() {
        return nameDifferentInLangFile;
    }

    public void setLangFileName(String langFileName) {
        this.langFileName = StringUtils.capitalize(langFileName);
    }

    public String getLangFileName() {
        return langFileName;
    }

    protected void setHitbox(double width, double height) {
        this.hitboxWidth = width;
        this.hitboxHeight = height;
    }

    public double getHitboxWidth() {
        return hitboxWidth;
    }

    public double getHitboxHeight() {
        return hitboxHeight;
    }

    protected void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setShoulderMountEffect(String shoulderMountEffect) {
        this.shoulderMountEffect = shoulderMountEffect;
    }

    public String getShoulderMountEffect() {
        return shoulderMountEffect;
    }

    public boolean isModeled() {
        return modeled;
    }

    public void setModeled(boolean modeled) {
        labels.remove(Label.NOT_MODELED);
        this.forms.forEach(pokemonForm -> pokemonForm.getLabels().remove(Label.NOT_MODELED));
        this.modeled = modeled;
    }

    protected void setBaseScaleAndScaleHitbox(double scale) {
        this.baseScale = scale;
    }

    protected void setBaseScale(double scale) {
        this.baseScale = scale;
        double newHitboxWidth = (double) height / 10;
        double newHitboxHeight = (double) height / 10;
        setHitbox(newHitboxWidth, newHitboxHeight);
        this.forms.forEach(forms -> {
            forms.setBaseScale(scale);
            double newFormHitboxWidth = (double) forms.getHeight() / 10;
            double newFormHitboxHeight = (double) forms.getHeight() / 10;
            setHitbox(newFormHitboxWidth, newFormHitboxHeight);
        });
    }

    public String getPreEvolution() {
        return this.preEvolution;
    }

    public double getProfileTranslationZ() {
        return profileTranslationZ;
    }

    public void setProfileTranslationZ(double profileTranslationZ) {
        this.profileTranslationZ = profileTranslationZ;
    }

    public double getProfileTranslationY() {
        return profileTranslationY;
    }

    public void setProfileTranslationY(double profileTranslationY) {
        this.profileTranslationY = profileTranslationY;
    }

    public double getProfileScale() {
        return profileScale;
    }

    public void setProfileScale(double profileScale) {
        this.profileScale = profileScale;
    }

    public double getProfileTranslationX() {
        return profileTranslationX;
    }

    public void setProfileTranslationX(double profileTranslationX) {
        this.profileTranslationX = profileTranslationX;
    }

    public Aspect getAdditionalAspect() {
        return formAdditionAspect;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setPokedexNumber(int i) {
        this.pokedexNumber = i;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setEvolutions(List<EvolutionEntry> objects) {
        this.evolutions = objects;
    }

    public void setDrops(List<ItemDrop> drops) {
        this.drops = drops;
    }

    public void setLearnSet(List<MoveLearnSetEntry> moves) {
        this.learnSet = moves;
    }

    public Pokemon setUsesBigModel() {
        this.usesBigModel = true;
//        this.baseScale = baseScale / 4;
        return this;
    }

    public Pokemon setPreferredBlocks(List<String> preferredBlocks) {
        this.preferredBlocks.addAll(preferredBlocks);
        return this;
    }

    public Pokemon addEvolutions(EvolutionEntry... preferredBlocks) {
        this.evolutions.addAll(List.of(preferredBlocks));
        return this;
    }

    public boolean usesBigModel() {
        return usesBigModel;
    }

    public List<String> getPreferredBlocks() {
        return preferredBlocks;
    }

    public boolean hasWeightMultiplier() {
        return !getPreferredBlocks().isEmpty();
    }

    public Boolean getCanWalkOnWater() {
        return canWalkOnWater;
    }

    public void setCanWalkOnWater(Boolean canWalkOnWater) {
        this.canWalkOnWater = canWalkOnWater;
    }

    public List<PokemonSpawnData> getSpawnData() {
        return spawnData;
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
                antiConditions, new ArrayList<>()));
        return this;
    }

    public Pokemon fishingSpawnFromExisting(List<SpawnCondition> additionalConditions){
        var firstSpawnData = spawnData.get(0);
        if (firstSpawnData != null) {
            var conditions = new ArrayList<>(filterConditionsForFishing(firstSpawnData.spawnConditions()));
            conditions.addAll(additionalConditions);
            var antiConditions = new ArrayList<>(filterConditionsForFishing(firstSpawnData.spawnAntiConditions()));
            createFishingSpawn(firstSpawnData.spawnPool(), firstSpawnData.minSpawnLevel(), firstSpawnData.maxSpawnLevel(), firstSpawnData.spawnWeight(), conditions, antiConditions);
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
}
