package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monstache extends drai.dev.data.pokemon.Pokemon {
    public Monstache() {
        super("Monstache",
                Type.DARK,
                new Stats(75,
                        75,
                        60,
                        88,
                        65,
                        70),
                List.of(Ability.SCRAPPY), Ability.FILTER,
                6, 0,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("In the wild, Monstache are very aggressive and territorial. In-fighting within Monstache groups often happen between members with differing Moustache styles."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 45, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Monstache");

    }


}
