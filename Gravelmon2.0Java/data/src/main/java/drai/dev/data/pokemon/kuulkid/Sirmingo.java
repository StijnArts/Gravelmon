package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sirmingo extends drai.dev.data.pokemon.Pokemon {
    public Sirmingo() {
        super("Sirmingo",
                Type.FAIRY,Type.DRAGON,
                new Stats(95,
                        110,
                        50,
                        110,
                        50,
                        55),
                List.of(Ability.ROMANTIC), Ability.CUTE_CHARM,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
                1,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 65, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sirmingo");

    }


}
