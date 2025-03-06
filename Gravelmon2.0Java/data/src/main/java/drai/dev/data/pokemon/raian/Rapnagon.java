package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rapnagon extends drai.dev.data.pokemon.Pokemon {
    public Rapnagon(Stats stats) {
        super("Rapnagon",
                Type.ROCK,Type.DRAGON,
                stats,
                List.of(Ability.ARENA_TRAP), null,
                35, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 75, .05, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NETHER_FORTRESS),
                0.28, 0.3,
                List.of());
           setLangFileName("Rapnagon");

    }


}
