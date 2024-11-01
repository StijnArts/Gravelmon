package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jitterbuddy extends drai.dev.data.pokemon.Pokemon {
    public Jitterbuddy() {
        super("Jitterbuddy",
                Type.NORMAL,Type.ELECTRIC,
                new Stats(60,
                        85,
                        52,
                        73,
                        40,
                        110),
                List.of(Ability.BALL_FETCH,Ability.STATIC), Ability.SPEED_BOOST,
                12, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 58, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Jitterbuddy");

    }


}
