package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public record PokemonSpawnData(SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel,
                               double spawnWeight, List<SpawnCondition> spawnConditions,
                               List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, List<String> preferredBlocks) {
    public static List<PokemonSpawnData> placeholder() {
        return new ArrayList<>(List.of(new PokemonSpawnData(SpawnContext.GROUNDED, SpawnPool.COMMON, 1,
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
}
