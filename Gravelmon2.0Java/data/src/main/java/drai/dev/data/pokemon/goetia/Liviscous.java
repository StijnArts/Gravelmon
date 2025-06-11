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
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.FOLIAGE)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Liviscous");

    }


}
