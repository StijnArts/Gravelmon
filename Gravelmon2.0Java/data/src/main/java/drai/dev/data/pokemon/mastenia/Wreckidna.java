package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wreckidna extends drai.dev.data.pokemon.Pokemon {
    public Wreckidna() {
        super("Wreckidna",
                Type.GRASS, Type.ELECTRIC,
                new Stats(72,
                        126,
                        98,
                        78,
                        74,
                        84),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their leaf-like quills are sharp and electrifying. There is no doubt that any Wreckidna will wreck anything in its path. While fueled by anger, they sometimes charge their opponents to protect their young. After their destruction, it is said to leave new soil where plants can grow."),
                List.of(),
                List.of(
                                                ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wreckidna");

    }


}
