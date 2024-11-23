package drai.dev.data.attributes;

import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonForm {
    public String preEvolution;
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
    private List<Label> labels = new ArrayList<>();
    private List<Aspect> aspects;
    private int height;
    private int weight;
    private List<EvolutionEntry> evolutions;
    private Boolean cannotDynamax = false;
    private Boolean isBattleOnly;
    private final List<PokemonSpawnData> spawnData = new ArrayList<>();
    private List<String> dexEntries;
    private List<drai.dev.data.attributes.ItemDrop> drops;
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
        this.abilities = new ArrayList<>();
        this.abilities.addAll(abilities);
        if(this.abilities.size() > 2){
            this.abilities.remove(2);
        }
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
        this.aspects = aspects;
        this.height = height;
        this.weight = weight;
        this.evolutions = evolutions;
        this.isBattleOnly = isBattleOnly;
        this.spawnData.add(new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>()));
        this.dexEntries = dexEntries;
        this.dropAmount = dropAmount;
        this.drops = new ArrayList<>();
        this.baseScale = baseScale;
        this.portraitScale = portraitScale;
        this.labels.addAll(labels);
        this.labels.add(Label.NOT_MODELED);
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
        this(name, isBattleOnly, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, aspects, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale);
        this.secondaryType = secondaryType;
    }

    public void setPreEvolution(String cleanName) {
        if(cleanName.equalsIgnoreCase("eevee")){
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
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

    public List<String> getDexEntries() {
        return dexEntries;
    }

    public List<ItemDrop> getDrops() {
        return drops;
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

    public void setBaseScale(double scale) {
        this.baseScale = scale;
    }

    public String getPreEvolution() {
        return preEvolution;
    }

    public void setDropAmount(int i) {
        dropAmount=i;
    }

    public void setHiddenAbility(Ability ability) {
        this.hiddenAbility = ability;
    }

    public List<PokemonSpawnData> getSpawnData() {
        return spawnData;
    }
}
