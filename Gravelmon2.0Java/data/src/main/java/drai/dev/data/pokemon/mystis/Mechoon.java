package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mechoon extends drai.dev.data.pokemon.Pokemon {
    public Mechoon() {
        super("Mechoon",
                Type.BUG, Type.ROCK,
                new Stats(60,
                        65,
                        80,
                        25,
                        35,
                        35),
                List.of(Ability.ROCK_HEAD), Ability.TRAMPLE,
                10, 699,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                105, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mechoon");

    }


}
