package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonSpawnDataBuilder {
    private final PokemonSpawnData pokemonSpawnData = PokemonSpawnData.placeholder().get(0);
    private int stage = 1;
    public PokemonSpawnDataBuilder(int stage) {
        this.stage = stage;
    }

    public PokemonSpawnDataBuilder() {
    }

    public List<PokemonSpawnData> build() {
        pokemonSpawnData.validate();
        return new ArrayList<>(List.of(pokemonSpawnData));
    }

    public PokemonSpawnDataBuilder mustHaveSkyAccess(boolean canSeeSky){
        var opt = pokemonSpawnData.getSpawnConditions().stream().filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY).findFirst();
        if(opt.isPresent()) {
            opt.get().setCondition(canSeeSky + "");
            return this;
        }
        pokemonSpawnData.getSpawnConditions().add(new SpawnCondition(SpawnConditionType.CANSEESKY, canSeeSky + ""));
        return this;
    }

    public PokemonSpawnDataBuilder setMinLevel(int minLevel){
        pokemonSpawnData.setMinSpawnLevel(minLevel);
        pokemonSpawnData.setMaxSpawnLevel(minLevel+20);
        return this;
    }

    public PokemonSpawnDataBuilder canSeeSky() {
        return mustHaveSkyAccess(true);
    }

    public PokemonSpawnDataBuilder cantSeeSky() {
        return mustHaveSkyAccess(false);
    }

    public PokemonSpawnDataBuilder setBiomes(Biome... biomes) {
        var biomeList = pokemonSpawnData.getBiomeSpawnCondition().getBiomes();
        if(biomeList.size() == 1 && biomeList.getFirst() == Biome.IS_VOID) biomeList.clear();
        biomeList.addAll(Arrays.asList(biomes));
        return this;
    }

    public PokemonSpawnDataBuilder setAntiBiomes(Biome... biomes) {
        var biomeList = pokemonSpawnData.getAntiBiomeSpawnCondition().getBiomes();
        if(biomeList.size() == 1 && biomeList.getFirst() == Biome.IS_VOID) biomeList.clear();
        biomeList.addAll(Arrays.asList(biomes));
        return this;
    }

    public PokemonSpawnDataBuilder setPool(SpawnPool spawnPool) {
        pokemonSpawnData.spawnPool = spawnPool;
        return this;
    }

    public PokemonSpawnDataBuilder setWeight(SpawnWeight weight) {
        return setWeight(weight.getWeight(stage));
    }

    public PokemonSpawnDataBuilder setWeight(double weight) {
        pokemonSpawnData.spawnWeight = weight;
        return this;
    }

    public PokemonSpawnDataBuilder setContext(SpawnContext spawnContext) {
        pokemonSpawnData.spawnContext = spawnContext;
        return this;
    }

    public PokemonSpawnDataBuilder setSpawnPreset(SpawnPreset... spawnPresets) {
        pokemonSpawnData.spawnPresets.addAll(Arrays.asList(spawnPresets));
        return this;
    }

    public PokemonSpawnDataBuilder atNight() {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.TIMERANGE, "night"));
        return this;
    }

    public PokemonSpawnDataBuilder duringDaytime() {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.TIMERANGE, "day"));
        return this;
    }

    public PokemonSpawnDataBuilder starter() {
        if(stage == 1){
            this.setMinLevel(5).setMaxLevel(31).setWeight(6.0);
        } else if (stage == 2){
            this.setMinLevel(16).setMaxLevel(40).setWeight(3.6);
        } else {
            this.setMinLevel(36).setMaxLevel(53).setWeight(.4);
        }

        return this.setPool(SpawnPool.ULTRA_RARE);
    }

    public PokemonSpawnDataBuilder legend() {
        return this.setPool(SpawnPool.ULTRA_RARE).setMinLevel(65).setWeight(0.0006);
    }

    public PokemonSpawnDataBuilder subLegend() {
        return this.setPool(SpawnPool.ULTRA_RARE).setMinLevel(55).setWeight(0.01);
    }

    public PokemonSpawnDataBuilder pseudoLegend() {
        if(stage == 1){
            this.setMinLevel(5).setMaxLevel(30).setWeight(6.0);
        } else if (stage == 2){
            this.setMinLevel(40).setWeight(3.6);
        } else {
            this.setMinLevel(65).setWeight(0.4);
        }

        return this.setPool(SpawnPool.ULTRA_RARE);
    }

    public PokemonSpawnDataBuilder setMaxLevel(int maxLevel) {
        pokemonSpawnData.setMaxSpawnLevel(maxLevel);
        return this;
    }

    public PokemonSpawnDataBuilder belowY(int y) {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.MAXY, ""+y));
        return this;
    }

    public PokemonSpawnDataBuilder isRaining() {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.IS_RAINING, true+""));
        return this;
    }

    public PokemonSpawnDataBuilder isThundering() {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.IS_THUNDERING, true+""));
        return this;
    }

    public PokemonSpawnDataBuilder isNotBiomes(Biome... biomes) {
        pokemonSpawnData.spawnAntiConditions.add(new BiomeSpawnCondition(List.of(biomes)));
        return this;
    }

    public PokemonSpawnDataBuilder setRequiredBlock(String... requiredBlocks) {
        pokemonSpawnData.requiredBlocks.addAll(List.of(requiredBlocks));
        return this;
    }

    public PokemonSpawnDataBuilder isNotRaining() {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.IS_RAINING, false+""));
        return this;
    }

    public PokemonSpawnDataBuilder eeveelution() {
//        SpawnPool.ULTRA_RARE, 44, 56, 1.0
        this.setMinLevel(44).setMaxLevel(56).setWeight(1.0).setPool(SpawnPool.ULTRA_RARE);
        return this;
    }

    public PokemonSpawnDataBuilder abnormality() {
//        SpawnPool.ULTRA_RARE, 44, 56, 1.0
        this.setMinLevel(50).setMaxLevel(70).setWeight(.05).setPool(SpawnPool.ULTRA_RARE);
        return this;
    }

    public PokemonSpawnDataBuilder mythical() {//TODO
//        SpawnPool.ULTRA_RARE, 44, 56, 1.0
        this.setMinLevel(50).setMaxLevel(70).setWeight(.05).setPool(SpawnPool.ULTRA_RARE);
        return this;
    }

    public PokemonSpawnDataBuilder aboveY(int y) {
        pokemonSpawnData.spawnConditions.add(new SpawnCondition(SpawnConditionType.MINY, ""+y));
        return this;
    }

    public PokemonSpawnDataBuilder fossil() {
        this.setMinLevel(1).setMaxLevel(1).setWeight(0).setPool(SpawnPool.ULTRA_RARE).setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL);
        return this;
    }
}
