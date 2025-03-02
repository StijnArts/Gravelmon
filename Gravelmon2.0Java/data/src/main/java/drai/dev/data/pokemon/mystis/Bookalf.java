package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bookalf extends drai.dev.data.pokemon.Pokemon {
    public Bookalf() {
        super("Bookalf",
                Type.FAIRY,
                new Stats(60,
                        50,
                        50,
                        50,
                        70,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.OBLIVIOUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                64, ExperienceGroup.ERRATIC,
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
           setLangFileName("Bookalf");

    }


}
