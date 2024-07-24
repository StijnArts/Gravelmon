package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lorable extends drai.dev.data.pokemon.Pokemon {
    public Lorable(Stats stats) {
        super("Lorable",
                Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lorable lives in trees, emerging at night to hunt insects. Despite its cute appearance, it produces a powerful toxin in its horn and should not be allowed near small children."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 41, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lorable");

    }


}
