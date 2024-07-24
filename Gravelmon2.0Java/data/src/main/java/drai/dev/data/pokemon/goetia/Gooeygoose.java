package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gooeygoose extends drai.dev.data.pokemon.Pokemon {
    public Gooeygoose(Stats stats) {
        super("Gooeygoose",
                Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As its shell is too small to offer much defense, it inflates its body to release a loud and powerful honk. Rivals face off with concert-like duels that few others can stand listening to."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 45, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE, SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Gooeygoose");

    }


}
