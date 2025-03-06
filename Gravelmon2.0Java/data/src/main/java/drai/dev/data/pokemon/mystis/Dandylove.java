package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dandylove extends drai.dev.data.pokemon.Pokemon {
    public Dandylove() {
        super("Dandylove",
                Type.GRASS,
                new Stats(75,
                        50,
                        50,
                        90,
                        65,
                        100),
                List.of(Ability.COTTON_DOWN), Ability.PARENTAL_BOND,
                18, 200,
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
           setLangFileName("Dandylove");

    }


}
