package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glaboar extends drai.dev.data.pokemon.Pokemon {
    public Glaboar(Stats stats) {
        super("Glaboar",
                Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("There is only one in each colony, resting at the heart of the colony’s labyrinthine nest. Although powerful, it relies on its legion of children and commands them with chemical signals."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 48, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SUMMER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glaboar");

    }


}
