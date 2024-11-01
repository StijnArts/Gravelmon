package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Garbagegutz extends drai.dev.data.pokemon.Pokemon {
    public Garbagegutz() {
        super("Garbagegutz",
                Type.POISON,Type.STEEL,
                new Stats(85,
                        77,
                        90,
                        66,
                        84,
                        85),
                List.of(Ability.TRASHGUARD), Ability.TRASHGUARD,
                15, 0,
                new Stats(0,0,2,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Garbagegutz");

    }


}
