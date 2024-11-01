package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bigpop extends drai.dev.data.pokemon.Pokemon {
    public Bigpop() {
        super("Bigpop",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(75,
                        100,
                        60,
                        90,
                        80,
                        120),
                List.of(Ability.SUPERCHARGE), Ability.NO_GUARD,
                18, 0,
                new Stats(0,1,0,0,0,2), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bigpop");

    }


}
