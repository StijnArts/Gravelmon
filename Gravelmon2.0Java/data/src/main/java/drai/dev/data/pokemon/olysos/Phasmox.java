package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Phasmox extends drai.dev.data.pokemon.Pokemon {
    public Phasmox() {
        super("Phasmox",
                Type.GHOST,
                new Stats(43,
                        30,
                        35,
                        40,
                        50,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 44,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Phasmox");

    }


}
