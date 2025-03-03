package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonSpawnData {
    SpawnContext spawnContext;
    SpawnPool spawnPool;
    int minSpawnLevel;
    int maxSpawnLevel;
    double spawnWeight;
    List<SpawnCondition> spawnConditions = new ArrayList<>();
    List<SpawnCondition> spawnAntiConditions = new ArrayList<>();
    List<SpawnPreset> spawnPresets = new ArrayList<>();
    List<String> preferredBlocks = new ArrayList<>();

    public PokemonSpawnData(SpawnContext spawnContext,
                            SpawnPool spawnPool,
                            int minSpawnLevel,
                            int maxSpawnLevel,
                            double spawnWeight,
                            List<SpawnCondition> spawnConditions,
                            List<SpawnCondition> spawnAntiConditions,
                            List<SpawnPreset> spawnPresets,
                            List<String> preferredBlocks) {
        this.spawnContext = spawnContext;
        this.spawnPool = spawnPool;
        this.minSpawnLevel = minSpawnLevel;
        this.maxSpawnLevel = maxSpawnLevel;
        this.spawnWeight = spawnWeight;
        this.spawnConditions.addAll(spawnConditions);
        this.spawnAntiConditions.addAll(spawnAntiConditions);
        this.spawnPresets.addAll(spawnPresets);
        this.preferredBlocks.addAll(preferredBlocks);
    }

    public static List<PokemonSpawnData> placeholder() {
        return new ArrayList<>(java.util.List.of(new PokemonSpawnData(SpawnContext.GROUNDED, SpawnPool.COMMON, 1,
                1, 0, new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>())));
    }

    @Override
    public String toString() {
        return "PokemonSpawnData{" +
                "spawnContext=" + spawnContext +
                ", spawnPool=" + spawnPool +
                ", minSpawnLevel=" + minSpawnLevel +
                ", maxSpawnLevel=" + maxSpawnLevel +
                ", spawnWeight=" + spawnWeight +
                ", spawnConditions=" + listToString(spawnConditions) +
                ", spawnAntiConditions=" + listToString(spawnAntiConditions) +
                ", spawnPresets=" + listToString(spawnPresets) +
                ", preferredBlocks=" + listToString(preferredBlocks) +
                '}';
    }

    public BiomeSpawnCondition getBiomeSpawnCondition(){
        var biomeSpawnConditionOptional = spawnConditions.stream().filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.BIOMES).findFirst();
        if(biomeSpawnConditionOptional.isPresent()) return (BiomeSpawnCondition) biomeSpawnConditionOptional.get();
        var biomeSpawnCondition = new BiomeSpawnCondition(new ArrayList<>());
        spawnConditions.add(biomeSpawnCondition);
        return biomeSpawnCondition;
    }

    private <T> String listToString(List<T> list) {
        return list.isEmpty() ? "[]" : "[" + String.join(", ", list.stream().map(Object::toString).toList()) + "]";
    }

    public SpawnContext getSpawnContext() {
        return spawnContext;
    }

    public void setSpawnContext(SpawnContext spawnContext) {
        this.spawnContext = spawnContext;
    }

    public SpawnPool getSpawnPool() {
        return spawnPool;
    }

    public void setSpawnPool(SpawnPool spawnPool) {
        this.spawnPool = spawnPool;
    }

    public int getMinSpawnLevel() {
        return minSpawnLevel;
    }

    public void setMinSpawnLevel(int minSpawnLevel) {
        this.minSpawnLevel = minSpawnLevel;
    }

    public int getMaxSpawnLevel() {
        return maxSpawnLevel;
    }

    public void setMaxSpawnLevel(int maxSpawnLevel) {
        this.maxSpawnLevel = maxSpawnLevel;
    }

    public double getSpawnWeight() {
        return spawnWeight;
    }

    public void setSpawnWeight(double spawnWeight) {
        this.spawnWeight = spawnWeight;
    }

    public List<SpawnCondition> getSpawnConditions() {
        return spawnConditions;
    }

    public void setSpawnConditions(List<SpawnCondition> spawnConditions) {
        this.spawnConditions = spawnConditions;
    }

    public List<SpawnCondition> getSpawnAntiConditions() {
        return spawnAntiConditions;
    }

    public void setSpawnAntiConditions(List<SpawnCondition> spawnAntiConditions) {
        this.spawnAntiConditions = spawnAntiConditions;
    }

    public List<SpawnPreset> getSpawnPresets() {
        return spawnPresets;
    }

    public void setSpawnPresets(List<SpawnPreset> spawnPresets) {
        this.spawnPresets = spawnPresets;
    }

    public List<String> getPreferredBlocks() {
        return preferredBlocks;
    }

    public void setPreferredBlocks(List<String> preferredBlocks) {
        this.preferredBlocks = preferredBlocks;
    }
}
