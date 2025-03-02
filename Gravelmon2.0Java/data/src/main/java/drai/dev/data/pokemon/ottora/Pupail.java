package drai.dev.data.pokemon.ottora;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupail extends drai.dev.data.pokemon.Pokemon {
    public Pupail() {
        super("Pupail",
                Type.BUG,
                new Stats(75,
                        65,
                        60,
                        30,
                        65,
                        15),
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
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupail");

    }


}
