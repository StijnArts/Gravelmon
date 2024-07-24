package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Andrymir extends drai.dev.data.pokemon.Pokemon {
    public Andrymir(Stats stats) {
        super("Andrymir",
                Type.ICE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Andrymir is an ancient ancestor of Thycicle that ruled the ice age thousands of years ago. Anything caught in its double jaws is frozen solid and shattered."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 59, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Andrymir");

    }


}
