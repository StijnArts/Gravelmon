package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chivapplir extends drai.dev.data.pokemon.Pokemon {
    public Chivapplir() {
        super("Chivapplir",
                Type.GRASS,Type.DRAGON,
                new Stats(144,
                        63,
                        171,
                        63,
                        41,
                        23),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chivapplir");

    }


}
