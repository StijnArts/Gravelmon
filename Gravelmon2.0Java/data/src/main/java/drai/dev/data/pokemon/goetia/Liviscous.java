package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Liviscous extends drai.dev.data.pokemon.Pokemon {
    public Liviscous(Stats stats) {
        super("Liviscous",
                Type.POISON, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It contaminates everything it touches with its secretions which cause sneezing and coughing. Even when at rest inside its kettle, built-up slime will suddenly spray out without any warning."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Liviscous");

    }


}
