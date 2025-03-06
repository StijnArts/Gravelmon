package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gourmeow extends drai.dev.data.pokemon.Pokemon {
    public Gourmeow() {
        super("Gourmeow",
                Type.STEEL,
                new Stats(73,
                        55,
                        85,
                        45,
                        53,
                        80),
                List.of(Ability.GOURMAND), Ability.GOURMAND,
                14, 0,
                new Stats(1,0,1,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 45, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Gourmeow");

    }


}
