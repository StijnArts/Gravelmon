package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Needatrap extends drai.dev.data.pokemon.Pokemon {
    public Needatrap(Stats stats) {
        super("Needatrap",
                Type.STEEL,
                stats,
                List.of(Ability.ARENA_TRAP), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 100,
                -1,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Needatrap");

    }


}
