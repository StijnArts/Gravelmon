package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Charger extends drai.dev.data.pokemon.Pokemon {
    public Charger(Stats stats) {
        super("Charger",
                Type.ROCK, Type.ELECTRIC,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                19, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 58, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MINESHAFT),
                0.28, 0.3,
                List.of());
           setLangFileName("Charger");

    }


}
