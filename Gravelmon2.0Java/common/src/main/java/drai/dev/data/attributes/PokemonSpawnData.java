package drai.dev.data.attributes;

import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
import java.util.logging.*;

public class PokemonSpawnData {
    WorldRepresentablePokemon pokemon;
    SpawnContext spawnContext;
    SpawnPool spawnPool;
    int minSpawnLevel;
    int maxSpawnLevel;
    double spawnWeight;
    List<SpawnCondition> spawnConditions = new ArrayList<>();
    List<SpawnCondition> spawnAntiConditions = new ArrayList<>();
    List<SpawnPreset> spawnPresets = new ArrayList<>();
    List<String> preferredBlocks = new ArrayList<>();
    List<String> requiredBlocks = new ArrayList<>();

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

    public void setPokemon(WorldRepresentablePokemon pokemon) {
        this.pokemon = pokemon;
    }

    public WorldRepresentablePokemon getPokemon() {
        return pokemon;
    }

    public static List<PokemonSpawnData> placeholder() {
        return new ArrayList<>(java.util.List.of(new PokemonSpawnData(SpawnContext.GROUNDED, SpawnPool.COMMON, 1,
                1, 0, new ArrayList<>(List.of(new BiomeSpawnCondition(List.of(Biome.IS_VOID)))), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>())));
    }

    @Override
    public String toString() {
        return "PokemonSpawnData[" +
                "spawnContext=" + spawnContext +
                ",\nspawnPool=" + spawnPool +
                ",\nspawnWeight=" + spawnWeight +
                ",\nspawnConditions=" + listToString(spawnConditions) +
                ",\nspawnAntiConditions=" + listToString(spawnAntiConditions) +
                ",\nspawnPresets=" + listToString(spawnPresets) +
                ",\npreferredBlocks=" + listToString(preferredBlocks) +
                ",\nrequiredBlocks=" + listToString(requiredBlocks) +
                ']';
    }

    public BiomeSpawnCondition getBiomeSpawnCondition() {
        var biomeSpawnConditionOptional = spawnConditions.stream().filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.BIOMES).findFirst();
        if (biomeSpawnConditionOptional.isPresent()) return (BiomeSpawnCondition) biomeSpawnConditionOptional.get();
        var biomeSpawnCondition = new BiomeSpawnCondition(new ArrayList<>());
        spawnConditions.add(biomeSpawnCondition);
        return biomeSpawnCondition;
    }

    public BiomeSpawnCondition getAntiBiomeSpawnCondition() {
        var biomeSpawnConditionOptional = spawnAntiConditions.stream().filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.BIOMES).findFirst();
        if (biomeSpawnConditionOptional.isPresent()) return (BiomeSpawnCondition) biomeSpawnConditionOptional.get();
        var biomeSpawnCondition = new BiomeSpawnCondition(new ArrayList<>());
        spawnAntiConditions.add(biomeSpawnCondition);
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

    public List<String> getRequiredBlocks() {
        return requiredBlocks;
    }

    public void validate() {
        if (spawnPresets.contains(SpawnPreset.NATURAL)) spawnPresets.add(SpawnPreset.WILD);
        if (getBiomeSpawnCondition().getBiomes().stream().allMatch(biome -> biome == Biome.IS_OVERWORLD) &&
                spawnConditions.stream().anyMatch(spawnCondition ->
                        spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY && "true".equalsIgnoreCase(spawnCondition.getCondition()))) {
            getBiomeSpawnCondition().getBiomes().removeIf(biome -> biome == Biome.IS_OVERWORLD);
            getBiomeSpawnCondition().getBiomes().add(Biome.IS_CAVE);
        }

        if (spawnPresets.contains(SpawnPreset.UNDERGROUND)) {
            getBiomeSpawnCondition().getBiomes().removeIf(biome -> biome == Biome.IS_OVERWORLD);
            if(getBiomeSpawnCondition().getBiomes().stream().noneMatch(biome -> biome==Biome.IS_CAVE))
                getBiomeSpawnCondition().getBiomes().add(Biome.IS_CAVE);
            spawnPresets.removeIf(spawnPreset -> spawnPreset == SpawnPreset.UNDERGROUND);
        }

        if (getSpawnConditions().stream().noneMatch(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY ||
                (spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY && "false".equalsIgnoreCase(spawnCondition.getCondition())))) {
            getSpawnConditions().add(new SpawnCondition(SpawnConditionType.CANSEESKY, "true"));
        }

        var snowyBiomes = List.of(
                Biome.IS_SNOWY, Biome.IS_SNOWY_FOREST, Biome.IS_FREEZING, Biome.IS_FROZEN_OCEAN, Biome.IS_PEAK
        );
        if (getBiomeSpawnCondition().getBiomes().stream().anyMatch(snowyBiomes::contains)) {
            if (getSpawnConditions().stream().anyMatch(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.IS_THUNDERING)) {
                getSpawnConditions().removeIf(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.IS_THUNDERING);
                getSpawnConditions().add(new SpawnCondition(SpawnConditionType.IS_RAINING, "true"));
                Logger.getAnonymousLogger().log(Level.WARNING, "PokemonSpawnData: " + this + " has a snowy biome condition and expects thunder. Mitigated");
            }
        }

        if (getBiomeSpawnCondition().getBiomes().stream().anyMatch(biome -> biome.name().toLowerCase().contains("nether")
                || biome.name().toLowerCase().contains("end"))) {
            spawnConditions.removeIf(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY);
        }
        if (getBiomeSpawnCondition().getBiomes().stream().anyMatch(biome -> biome==Biome.IS_OVERWORLD)) {

        }

        if (SpawnContext.GROUNDED != getSpawnContext()) {
            if (getSpawnPresets().contains(SpawnPreset.NATURAL)) {
                Logger.getAnonymousLogger().log(Level.WARNING, "PokemonSpawnData: " + this + " has a submerged or seafloor context and a natural spawn preset. This is not allowed.");
                getSpawnPresets().remove(SpawnPreset.NATURAL);
                if (getSpawnContext() == SpawnContext.SUBMERGED || getSpawnContext() == SpawnContext.SEAFLOOR) {
                    getSpawnPresets().add(SpawnPreset.UNDERWATER);
                } else if (getSpawnContext() == SpawnContext.SURFACE) {
                    getSpawnPresets().add(SpawnPreset.WATER_SURFACE);
                }
            }
        }
    }
}
