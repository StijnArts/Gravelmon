package drai.dev.gravelmon.pokemon;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pokemon {
    public static String pokemonThatEvolveIntoThemselves = "Encountered pokemon that evolve into Themselves:";
    public static ArrayList<Pokemon> pokemonRegistry = new ArrayList<>();
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
    private List<PokemonForm> forms;
    private List<MoveLearnSetEntry> learnSet;
    private List<Label> labels;
    private List<String> dexEntries;
    private String preEvolution;
    private List<EvolutionEntry> evolutions;
    private int baseFriendship;
    private Stats evYield;
    private int height;
    private int weight;
    private Boolean cannotDynamax = false;
    private Boolean isNew = true;
    private boolean hasGenderDifferences = false;
    private SpawnContext spawnContext;
    private SpawnPool spawnPool;
    private int minSpawnLevel;
    private int maxSpawnLevel;
    private double spawnWeight;
    private List<SpawnCondition> spawnConditions;
    private List<SpawnCondition> spawnAntiConditions;
    private List<SpawnPreset> spawnPresets;
    private Effect shoulderEffect;
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
    private Boolean avoidsLand = false;
    private double baseScale;
    private double portraitScale;
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

    public Pokemon(String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels){
        this(name, primaryType, secondaryType, new Stats(10,10,10,10,10,10),List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10,10,new Stats(0,0,0,0,0,0),255, 0.5, 50, ExperienceGroup.MEDIUM_FAST, 70, 30, List.of(EggGroup.UNDISCOVERED),
                List.of(""), evolutions, List.of(new MoveLearnSetEntry(Move.TACKLE,1), new MoveLearnSetEntry(Move.GROWL, 1)),labels, 0, List.of(),SpawnContext.GROUNDED,
                SpawnPool.COMMON, 1,1,0,List.of(), List.of(),List.of(SpawnPreset.RUINED_STRUCTURES),0.4,0.4,List.of());
        this.setSecondaryType(secondaryType);
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels){
        this(dexNo, name, primaryType, secondaryType, new Stats(10,10,10,10,10,10),List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10,10,new Stats(0,0,0,0,0,0),255, 0.5, 50, ExperienceGroup.MEDIUM_FAST, 70, 30, List.of(EggGroup.UNDISCOVERED),
                List.of(""), evolutions, List.of(new MoveLearnSetEntry(Move.TACKLE,1), new MoveLearnSetEntry(Move.GROWL, 1)),labels, 0, List.of(),SpawnContext.GROUNDED,
                SpawnPool.COMMON, 1,1,0,List.of(), List.of(),List.of(SpawnPreset.RUINED_STRUCTURES),0.4,0.4,List.of());
        this.setSecondaryType(secondaryType);
    }

    public Pokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,baseScale,portraitScale,forms);
        this.secondaryType = secondaryType;
    }

    public Pokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(dexNo, name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,baseScale,portraitScale,forms);
        this.secondaryType = secondaryType;
    }
    public Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
                evYield,catchRate,maleRatio,baseExperienceYield,
                experienceGroup,baseFriendship,eggCycles,eggGroups,
                dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
                minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
                spawnPresets,forms);
        GravelmonJsonGenerator.incrementDexCounter();
    }

    public Pokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,

                   List<String> dexEntries,

                   List<EvolutionEntry> evolutions,

                   List<MoveLearnSetEntry> learnSet,

                   List<Label> labels,

                   int dropAmount, List<ItemDrop> drops,

                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                   double baseScale, double portraitScale,

                   List<PokemonForm> forms) {
        this(name,primaryType,stats,abilities,hiddenAbility,height,weight,
            evYield,catchRate,maleRatio,baseExperienceYield,
            experienceGroup,baseFriendship,eggCycles,eggGroups,
            dexEntries,evolutions,learnSet,labels,dropAmount,drops,spawnContext,spawnPool,
            minSpawnLevel,maxSpawnLevel,spawnWeight,spawnConditions,spawnAntiConditions,
            spawnPresets,forms);
        GravelmonJsonGenerator.setDexCounter(dexNo);
        pokedexNumber = dexNo;
        GravelmonJsonGenerator.incrementDexCounter();
    }

    private Pokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                   Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                   int eggCycles, List<EggGroup> eggGroups,
                   List<String> dexEntries,
                   List<EvolutionEntry> evolutions,
                   List<MoveLearnSetEntry> learnSet,
                   List<Label> labels,
                   int dropAmount, List<ItemDrop> drops,
                   SpawnContext spawnContext, SpawnPool spawnPool,
                   int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                   List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,
                   List<PokemonForm> forms) {
        this.name = name;
        this.stats = stats;
        this.primaryType = primaryType;
        this.secondaryType = null;
        this.abilities = abilities;
        this.hiddenAbility = hiddenAbility;
        this.catchRate = catchRate;
        this.maleRatio = maleRatio;
        this.baseExperienceYield = baseExperienceYield;
        this.experienceGroup = experienceGroup;
        this.eggCycles = eggCycles;
        this.eggGroups = eggGroups;
        this.dropAmount = dropAmount;
        this.drops = drops;
        this.pokedexNumber = GravelmonJsonGenerator.getDexCounter();
        this.forms = forms;
        this.learnSet = learnSet;
        this.labels = new ArrayList<>(labels);
        this.labels.add(Label.NOT_MODELED);
        this.dexEntries = dexEntries;
        this.evolutions = evolutions;
        this.baseFriendship = baseFriendship;
        this.evYield = evYield;
        this.height = height;
        this.weight = weight;
        this.spawnContext = spawnContext;
        this.spawnPool = spawnPool;
        this.minSpawnLevel = minSpawnLevel;
        this.maxSpawnLevel = maxSpawnLevel;
        this.spawnWeight = spawnWeight;
        this.spawnConditions = spawnConditions;
        this.spawnAntiConditions = spawnAntiConditions;
        this.spawnPresets = spawnPresets;
        this.baseScale = Math.max((height*1.5) /10/8,0.1);
        if(height/10 > 10){
            this.hitboxWidth = 5;
            this.hitboxHeight = 5;
        } else if(height/10 < 4){
            this.hitboxWidth = 3;
            this.hitboxHeight = 3;
        } else {
            this.hitboxWidth = (height/10 * 1.5) / 4 / 1.3;
            this.hitboxHeight = (height/10 * 1.5) / 4 / 1.3;
        }
        this.portraitScale = 0.3;
        pokemonRegistry.add(this);
    }

    public static void scanEvolutions() {
        for (Pokemon pokemon : pokemonRegistry) {
            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                Pokemon result = pokemonRegistry.stream().filter(p -> p.getName().equalsIgnoreCase(evolutionEntry.getResult())).findFirst().orElse(null);
                if(result != null){
                    if(result.preEvolution==null){
                        break;
                    }
                    else if(!result.preEvolution.isEmpty()){
                        break;
                    }
                    if(result.getCleanName().equals(pokemon.getCleanName())){
                        pokemonThatEvolveIntoThemselves+=pokemon.getCleanName()+",\n";
                    }
                    if(!isBasedOnOriginalPokemon(pokemon)){
                        result.getLabels().add(Label.FAKEMON);
                    }
                    result.setPreEvolution(pokemon.getCleanName());
                }
            }
        }
        System.out.println(pokemonThatEvolveIntoThemselves);
    }

    private static boolean isBasedOnOriginalPokemon(Pokemon pokemon) {
        boolean isEvoOfAPreviousPokemon = false;
        for (Label label : pokemon.labels) {
            String generationLabel = "gen";
            for (int i = 1; i < 10; i++) {
                if(label.getName().equalsIgnoreCase(generationLabel+i)){
                    isEvoOfAPreviousPokemon = true;
                }
            }
        }
        return isEvoOfAPreviousPokemon;
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

    public String getName(){
        return name;
    }

    public String getCleanName() {
        return name.toLowerCase().replace(' ','_').replaceAll("[^a-zA-Z0-9_]", "")
                .replace("'","").replace("\\.","");
    }

    public Stats getStats(){
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

    public List<SpawnCondition> getSpawnConditions() {
        return spawnConditions;
    }

    public List<SpawnCondition> getSpawnAntiConditions() {
        return spawnAntiConditions;
    }

    public List<SpawnPreset> getSpawnPresets() {
        return spawnPresets;
    }

    public Effect getShoulderEffect() {
        return shoulderEffect;
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
        this.langFileName = langFileName;
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
        double newHitboxWidth = (double)height/10;
        double newHitboxHeight = (double)height/10;
        setHitbox(newHitboxWidth,newHitboxHeight);
        this.forms.forEach(forms->{forms.setBaseScale(scale);
            double newFormHitboxWidth = (double)forms.getHeight()/10;
            double newFormHitboxHeight = (double)forms.getHeight()/10;
            setHitbox(newFormHitboxWidth,newFormHitboxHeight);});
    }

    protected void setPreEvolution(String cleanName) {
        if(cleanName.equalsIgnoreCase("eevee")){
            this.labels.add(Label.EEVEELUTION);
        }
        this.labels.add(Label.FAKEMON_EVOLUTION);
        this.preEvolution = cleanName;
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
}
