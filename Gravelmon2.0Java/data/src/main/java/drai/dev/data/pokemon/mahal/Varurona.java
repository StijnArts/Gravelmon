package drai.dev.data.pokemon.mahal;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Varurona extends drai.dev.data.pokemon.Pokemon {
    public Varurona() {
        super("Varurona",
                Type.WATER,Type.BUG,
                new Stats(91,
                        45,
                        77,
                        114,
                        114,
                        105),
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
                List.of(Label.MAHAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Varurona");

    }


}
