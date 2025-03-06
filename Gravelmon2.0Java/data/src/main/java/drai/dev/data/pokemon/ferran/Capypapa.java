package drai.dev.data.pokemon.ferran;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Capypapa extends drai.dev.data.pokemon.Pokemon {
    public Capypapa() {
        super("Capypapa",
                Type.NORMAL,Type.WATER,
                new Stats(118,
                        35,
                        115,
                        100,
                        69,
                        19),
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
                List.of(Label.FERRAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Capypapa");

    }


}
