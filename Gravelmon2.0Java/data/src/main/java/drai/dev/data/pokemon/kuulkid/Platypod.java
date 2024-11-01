package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Platypod extends drai.dev.data.pokemon.Pokemon {
    public Platypod() {
        super("Platypod",
                Type.BUG,
                new Stats(85,
                        75,
                        68,
                        55,
                        96,
                        65),
                List.of(Ability.EARTH_EATER), Ability.EARTH_EATER,
                12, 0,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 30, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Platypod");

    }


}
