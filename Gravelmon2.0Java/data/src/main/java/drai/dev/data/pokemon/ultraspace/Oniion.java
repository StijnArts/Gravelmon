package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oniion extends drai.dev.data.pokemon.Pokemon {
    public Oniion() {
        super("Oniion",
                Type.DARK, Type.GRASS,
                new Stats(100,
                        140,
                        90,
                        100,
                        90,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Oniion");

    }


}
