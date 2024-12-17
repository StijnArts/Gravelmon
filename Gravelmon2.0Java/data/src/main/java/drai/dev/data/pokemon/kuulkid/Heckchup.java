package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Heckchup extends drai.dev.data.pokemon.Pokemon {
    public Heckchup() {
        super("Heckchup",
                Type.POISON,Type.DARK,
                new Stats(68,
                        92,
                        50,
                        93,
                        43,
                        64),
                List.of(Ability.MERCILESS), Ability.MERCILESS,
                11, 0,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heckchup");

    }


}
