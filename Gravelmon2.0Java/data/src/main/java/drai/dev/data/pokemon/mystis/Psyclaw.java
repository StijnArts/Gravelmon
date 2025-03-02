package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psyclaw extends drai.dev.data.pokemon.Pokemon {
    public Psyclaw() {
        super("Psyclaw",
                Type.PSYCHIC,
                new Stats(50,
                        60,
                        65,
                        90,
                        60,
                        50),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                131, ExperienceGroup.ERRATIC,
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
           setLangFileName("Psyclaw");

    }


}
