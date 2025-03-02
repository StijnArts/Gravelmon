package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Meowtem extends drai.dev.data.pokemon.Pokemon {
    public Meowtem() {
        super("Meowtem",
                Type.GHOST,
                new Stats(66,
                        30,
                        40,
                        94,
                        40,
                        60),
                List.of(Ability.CUTE_CHARM), Ability.RUN_AWAY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Meowtem");

    }


}
