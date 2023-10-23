package drai.dev.gravelmon.pokemon.attributes;

import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class PokemonForm {
    private String name;
    private Type primaryType;
    private Type secondaryType;
    private List<Ability> abilities;
    private Ability hiddenAbility;
    private Stats stats;
    private int catchRate;
    private double maleRatio;
    private int baseExperienceYield;
    private int baseFriendship;
    private Stats evYield;
    private ExperienceGroup experienceGroup;
    private int eggCycles;
    private List<EggGroup> eggGroups;
    private List<MoveLearnSetEntry> learnSet;
    private List<Label> labels;
    private List<Aspect> aspects;
    private int height;
    private int weight;
    private List<EvolutionEntry> evolutions;
    private Boolean cannotDynamax = false;
    private Boolean isBattleOnly;
    private List<SpawnCondition> spawnConditions;
    private List<SpawnCondition> spawnAntiConditions;
    private int minSpawnLevel;
    private int maxSpawnLevel;
    private double spawnWeight;
    private SpawnContext spawnContext;
    private SpawnPool spawnPool;
    private List<SpawnPreset> spawnPresets;
    private List<String> dexEntries;
    private List<ItemDrop> drops;
    private int dropAmount;
    private double baseScale;
    private boolean hasSeparateModel = false;
    private double portraitScale;
    private double portraitTranslationX = 0;
    private double portraitTranslationY = 0;
    private double portraitTranslationZ = 0;

    public String getFormName() {
        return name;
    }

    public String getCleanName() {
        return name.toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                       double baseScale, double portraitScale

    ) {
        this.name = name;
        this.primaryType = primaryType;
        this.abilities = abilities;
        this.hiddenAbility = hiddenAbility;
        this.stats = stats;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield;
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups = eggGroups;
        this.learnSet = learnSet;
        this.labels = labels;
        this.aspects = aspects;
        this.height = height;
        this.weight = weight;
        this.evolutions = evolutions;
        this.isBattleOnly = isBattleOnly;
        this.spawnConditions = spawnConditions;
        this.minSpawnLevel = minSpawnLevel;
        this.maxSpawnLevel = maxSpawnLevel;
        this.spawnWeight = spawnWeight;
        this.spawnContext = spawnContext;
        this.spawnPool = spawnPool;
        this.spawnPresets = spawnPresets;
        this.dexEntries = dexEntries;
        this.dropAmount = dropAmount;
        this.drops = drops;
        this.spawnAntiConditions = spawnAntiConditions;
        this.baseScale = baseScale;
        this.portraitScale = portraitScale;
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Type secondaryType,
                       Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                       double baseScale, double portraitScale

    ) {
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.abilities = abilities;
        this.hiddenAbility = hiddenAbility;
        this.stats = stats;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield;
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups = eggGroups;
        this.learnSet = learnSet;
        this.labels = labels;
        this.aspects = aspects;
        this.height = height;
        this.weight = weight;
        this.evolutions = evolutions;
        this.isBattleOnly = isBattleOnly;
        this.spawnConditions = spawnConditions;
        this.minSpawnLevel = minSpawnLevel;
        this.maxSpawnLevel = maxSpawnLevel;
        this.spawnWeight = spawnWeight;
        this.spawnContext = spawnContext;
        this.spawnPool = spawnPool;
        this.spawnPresets = spawnPresets;
        this.dexEntries = dexEntries;
        this.dropAmount = dropAmount;
        this.drops = drops;
        this.spawnAntiConditions = spawnAntiConditions;
        this.baseScale = (double)(height*1.5)/10/8;
        this.portraitScale = 0.3;
    }

    public boolean hasSeparateModel() {
        return hasSeparateModel;
    }

    public void setHasSeparateModel(boolean hasSeparateModel) {
        this.hasSeparateModel = hasSeparateModel;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Ability getHiddenAbility() {
        return hiddenAbility;
    }

    public Stats getStats() {
        return stats;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public double getMaleRatio() {
        return maleRatio;
    }

    public int getBaseExperienceYield() {
        return baseExperienceYield;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public Stats getEvYield() {
        return evYield;
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


    public Boolean cannotDynamax() {
        return cannotDynamax;
    }

    public Boolean isBattleOnly() {
        return isBattleOnly;
    }

    public List<SpawnCondition> getSpawnConditions() {
        return spawnConditions;
    }

    public SpawnContext getSpawnContext() {
        return spawnContext;
    }

    public SpawnPool getSpawnPool() {
        return spawnPool;
    }

    public int getMinSpawnLevel() {
        return minSpawnLevel;
    }

    public int getMaxSpawnLevel() {
        return maxSpawnLevel;
    }

    public double getSpawnWeight() {
        return spawnWeight;
    }

    public List<SpawnPreset> getSpawnPresets() {
        return spawnPresets;
    }

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<ItemDrop> getDrops() {
        return drops;
    }

    public List<SpawnCondition> getSpawnAntiConditions() {
        return spawnAntiConditions;
    }

    public int getDropAmount() {
        return dropAmount;
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
}
