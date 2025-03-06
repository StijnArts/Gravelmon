package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Druidigo extends drai.dev.data.pokemon.Pokemon {
    public Druidigo() {
        super("Druidigo",
                Type.NORMAL,Type.DARK,
                new Stats(104,
                        88,
                        124,
                        36,
                        80,
                        44),
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
           setLangFileName("Druidigo");

    }


}
