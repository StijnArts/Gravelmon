package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wulvlacine extends drai.dev.data.pokemon.Pokemon {
    public Wulvlacine() {
        super("Wulvlacine",
                Type.ROCK, Type.DARK,
                new Stats(75,
                        128,
                        96,
                        65,
                        65,
                        86),
                List.of(Ability.STRONG_JAW,Ability.ROUGH_SKIN), Ability.SOLID_ROCK,
                0, 0,
                new Stats(0,2,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wulvlacine");

    }


}
