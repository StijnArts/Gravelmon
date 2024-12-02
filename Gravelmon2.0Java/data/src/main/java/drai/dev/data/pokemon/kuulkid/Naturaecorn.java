package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Naturaecorn extends drai.dev.data.pokemon.Pokemon {
    public Naturaecorn() {
        super("Naturaecorn",
                Type.GRASS,Type.BUG,
                new Stats(96,
                        78,
                        66,
                        96,
                        80,
                        64),
                List.of(Ability.SWARM), Ability.SWARM,
                17, 0,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Naturaecorn");

    }


}
