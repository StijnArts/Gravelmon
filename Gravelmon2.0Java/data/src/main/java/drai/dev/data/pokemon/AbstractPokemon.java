package drai.dev.data.pokemon;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public abstract class AbstractPokemon extends WorldRepresentablePokemon {
    protected static String pokemonThatEvolveIntoThemselves = "Encountered pokemon that evolve into Themselves:";
    public static Map<String, Pokemon> POKEMON_REGISTRY = new HashMap<>();
    public static Map<String, List<Pokemon>> ADDITIONAL_FORMS = new HashMap<>();
    public static Map<String, List<EvolutionEntry>> ADDITIONAL_EVOLUTIONS = new HashMap<>();
    public static Map<String, List<ItemDrop>> ADDITIONAL_DROPS = new HashMap<>();
    public static Map<String, String> ADDITIONAL_PRE_EVOLUTIONS = new HashMap<>();
    public static List<Pokemon> FOSSIL_POKEMON = new ArrayList<>();
    public static List<String> EVOLUTION_ITEMS = new ArrayList<>();
    public static List<Aspect> ADDITIONAL_SPECIES_ASPECTS = new ArrayList<>();

    protected String name;
    protected Game game;
    protected Stats stats;
    protected Type primaryType;
    protected Type secondaryType;
    protected final List<Ability> abilities = new ArrayList<>();
    protected Ability hiddenAbility;
    protected int catchRate;
    protected double maleRatio;
    protected int baseExperienceYield;
    protected ExperienceGroup experienceGroup;
    protected int eggCycles;
    protected List<EggGroup> eggGroups = new ArrayList<>();
    protected int dropAmount;
    protected final List<ItemDrop> drops = new ArrayList<>();
    protected final int baseFriendship;
    protected final Stats evYield;
    protected String preEvolution;
    protected List<MoveLearnSetEntry> learnSet = new ArrayList<>();
    protected final List<Label> labels = new ArrayList<>();
    protected final List<Aspect> aspects = new ArrayList<>();
    protected final int height;
    protected final int weight;
    protected final List<EvolutionEntry> evolutions = new ArrayList<>();
    protected Boolean cannotDynamax = false;
    protected final List<String> dexEntries = new ArrayList<>();
    protected final List<PokemonSpawnData> spawnData = new ArrayList<>();
    protected double baseScale;
    public AbstractPokemon(String name, Stats stats, Type primaryType, Type secondaryType, List<Ability> abilities, Ability hiddenAbility,
                           int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                           int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<Label> labels, int dropAmount, List<ItemDrop> drops, int baseFriendship,
                           Stats evYield, List<MoveLearnSetEntry> learnSet, List<Aspect> aspects,
                           int height, int weight, SpawnContext spawnContext,
                           SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                           List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets) {
        this(name, stats, primaryType, abilities, hiddenAbility, catchRate, maleRatio, baseExperienceYield, experienceGroup,
                eggCycles, eggGroups, dexEntries, evolutions, labels, dropAmount, drops, baseFriendship, evYield, learnSet, aspects, height, weight, spawnContext, spawnPool,
                minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets);
        this.secondaryType = secondaryType;
    }

    public AbstractPokemon(String name, Stats stats, Type primaryType, List<Ability> abilities, Ability hiddenAbility,
                           int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup,
                           int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions,
                           List<Label> labels, int dropAmount, List<ItemDrop> drops, int baseFriendship,
                           Stats evYield, List<MoveLearnSetEntry> learnSet, List<Aspect> aspects,
                           int height, int weight, SpawnContext spawnContext,
                           SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                           List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets) {
        this.name = getClass().getSimpleName();
        this.stats = stats;
        this.primaryType = primaryType;
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield == 0 ? 60 : baseExperienceYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups.addAll(eggGroups);
        if(this.eggGroups.isEmpty()) this.eggGroups = new ArrayList<>(List.of(EggGroup.FIELD));
        this.dropAmount = dropAmount;
        this.drops.addAll(drops);
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.learnSet.addAll(learnSet);
        this.aspects.addAll(aspects);
        this.height = height;
        this.weight = weight;
        this.baseScale = Math.max((double) height / 10 / 6, 0.1);
        this.spawnData.add(new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>()));

        this.dexEntries.addAll(dexEntries);
        this.labels.addAll(labels);
        this.labels.add(Label.NOT_MODELED);
        this.evolutions.addAll(evolutions);
        this.abilities.addAll(abilities);
        if (this.abilities.size() > 2) {
            this.abilities.remove(2);
        }
    }

    public static boolean isAnAdditionalForm(String key) {
        var result = ADDITIONAL_SPECIES_ASPECTS.stream().anyMatch(aspect -> Arrays.stream(key.split("(?=\\p{Upper})")).anyMatch(s -> s.equalsIgnoreCase(aspect.getName())));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(Type primaryType) {
        this.primaryType = primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(Ability hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public double getMaleRatio() {
        return maleRatio;
    }

    public void setMaleRatio(double maleRatio) {
        this.maleRatio = maleRatio;
    }

    public int getBaseExperienceYield() {
        return baseExperienceYield;
    }

    public void setBaseScale(double scale) {
        this.baseScale = scale;
    }

    public ExperienceGroup getExperienceGroup() {
        return experienceGroup;
    }

    public void setExperienceGroup(ExperienceGroup experienceGroup) {
        this.experienceGroup = experienceGroup;
    }

    public int getEggCycles() {
        return eggCycles;
    }

    public String getCleanName() {
        return name.toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public void setEggCycles(int eggCycles) {
        this.eggCycles = eggCycles;
    }

    public List<EggGroup> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<EggGroup> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public int getDropAmount() {
        return dropAmount;
    }

    public void setDropAmount(int dropAmount) {
        this.dropAmount = dropAmount;
    }

    public List<ItemDrop> getDrops() {
        return drops;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public Stats getEvYield() {
        return evYield;
    }

    public String getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(String cleanName) {
        if (cleanName.equalsIgnoreCase("eevee")) {
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
    }

    public List<MoveLearnSetEntry> getLearnSet() {
        return learnSet;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<Aspect> getAspects() {
        return aspects;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public List<EvolutionEntry> getEvolutions() {
        return evolutions;
    }

    public Boolean getCannotDynamax() {
        return cannotDynamax;
    }

    public void setCannotDynamax(Boolean cannotDynamax) {
        this.cannotDynamax = cannotDynamax;
    }

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<PokemonSpawnData> getSpawnData() {
        return spawnData;
    }

    public double getBaseScale() {
        return baseScale;
    }

    public void setLearnSet(List<MoveLearnSetEntry> learnSet) {
        this.learnSet = learnSet;
    }

    public void setBaseExperienceYield(int baseExperienceYield) {
        this.baseExperienceYield = baseExperienceYield;
    }

    protected static boolean isBasedOnOriginalPokemon(Pokemon pokemon) {
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

    public static boolean isAnAdditionalForm(Pokemon pokemon) {
        if(pokemon == null) return false;
        return pokemon.getAdditionalAspect() != null;
    }

    protected static void addItemAsDrop(PokemonForm from, String evolutionEntry, PokemonForm result) {
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

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
