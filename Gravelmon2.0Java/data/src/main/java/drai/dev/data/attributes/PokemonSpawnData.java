package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public record PokemonSpawnData(SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel,
                               double spawnWeight, List<SpawnCondition> spawnConditions,
                               List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, List<String> preferredBlocks) {
    public static List<PokemonSpawnData> placeholder() {
        return new ArrayList<>(List.of(new PokemonSpawnData(SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL), new ArrayList<>())));
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

    private <T> String listToString(List<T> list) {
        return list.isEmpty() ? "[]" : "[" + String.join(", ", list.stream().map(Object::toString).toList()) + "]";
    }
}
