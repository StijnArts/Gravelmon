package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gundoru extends drai.dev.data.pokemon.Pokemon {
    public Gundoru() {
        super("Gundoru",
                Type.ELECTRIC,Type.GROUND,
                new Stats(73,
                        100,
                        45,
                        65,
                        42,
                        73),
                List.of(Ability.MUNCHMISSILE), Ability.MUNCHMISSILE,
                6, 0,
                new Stats(0,1,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gundoru");

    }


}
