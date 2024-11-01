package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squatchelor extends drai.dev.data.pokemon.Pokemon {
    public Squatchelor() {
        super("Squatchelor",
                Type.GRASS,Type.NORMAL,
                new Stats(97,
                        85,
                        72,
                        50,
                        76,
                        65),
                List.of(Ability.MATINGCALL), Ability.MATINGCALL,
                21, 0,
                new Stats(1,1,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 48, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squatchelor");

    }


}
