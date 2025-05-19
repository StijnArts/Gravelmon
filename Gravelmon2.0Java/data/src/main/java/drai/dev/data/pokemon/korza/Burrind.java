package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burrind extends drai.dev.data.pokemon.Pokemon {
    public Burrind() {
        super("Burrind",
                Type.GROUND,Type.ROCK,
                new Stats(112,
                        62,
                        81,
                        53,
                        79,
                        63),
                List.of(Ability.INNER_FOCUS,Ability.UNAWARE), Ability.SAND_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Burrind's corkscrew motion and hardened scales allow it to burrow through tough rock. It can puff out its rocky scales as a way to keep itself in the ground, or to appear bigger to threats."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Burrind");

    }


}
