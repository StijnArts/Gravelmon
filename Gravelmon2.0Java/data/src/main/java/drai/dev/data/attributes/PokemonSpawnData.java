package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public record PokemonSpawnData(SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel,
                               double spawnWeight, List<SpawnCondition> spawnConditions,
                               List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets) {
}
