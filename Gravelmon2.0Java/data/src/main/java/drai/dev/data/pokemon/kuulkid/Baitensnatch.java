package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baitensnatch extends drai.dev.data.pokemon.Pokemon {
    public Baitensnatch() {
        super("Baitensnatch",
                Type.GRASS,Type.DARK,
                new Stats(53,
                        99,
                        55,
                        43,
                        40,
                        101),
                List.of(Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                8, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 45, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baitensnatch");

    }


}
