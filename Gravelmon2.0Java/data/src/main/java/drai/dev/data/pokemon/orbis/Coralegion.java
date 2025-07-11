package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coralegion extends drai.dev.data.pokemon.Pokemon {
    public Coralegion() {
        super("Coralegion",
                Type.ROCK, Type.FAIRY,
                new Stats(116,
                        100,
                        168,
                        128,
                        108,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 4510,
                new Stats(0,0,3,0,0,0), 3,
                0.0,
                280, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.REEF, SpawnPreset.UNDERWATER).build(),
                List.of());
           setLangFileName("Coralegion");

    }


}
