package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snowalone extends drai.dev.data.pokemon.Pokemon {
    public Snowalone() {
        super("Snowalone",
                Type.ICE,Type.NORMAL,
                new Stats(76,
                        65,
                        72,
                        85,
                        97,
                        50),
                List.of(Ability.MATINGCALL), Ability.MATINGCALL,
                22, 0,
                new Stats(0,0,0,1,1,0), 60,
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
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snowalone");

    }


}
