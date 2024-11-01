package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Doubrawl extends drai.dev.data.pokemon.Pokemon {
    public Doubrawl() {
        super("Doubrawl",
                Type.DRAGON,
                new Stats(73,
                        98,
                        71,
                        95,
                        50,
                        82),
                List.of(Ability.DOUBLEDRAGON), Ability.DOUBLEDRAGON,
                18, 0,
                new Stats(0,1,0,1,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Doubrawl");

    }


}
