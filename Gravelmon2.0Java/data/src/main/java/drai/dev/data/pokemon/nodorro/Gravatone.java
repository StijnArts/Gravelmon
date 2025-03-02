package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gravatone extends drai.dev.data.pokemon.Pokemon {
    public Gravatone() {
        super("Gravatone",
                Type.ROCK, Type.ELECTRIC,
                new Stats(70,
                        105,
                        80,
                        125,
                        90,
                        80),
                List.of(Ability.LEVITATE), Ability.LIGHTNING_ROD,
                18, 2080,
                new Stats(0,1,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gravatone");

    }


}
