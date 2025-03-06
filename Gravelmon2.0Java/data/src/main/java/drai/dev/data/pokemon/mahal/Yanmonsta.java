package drai.dev.data.pokemon.mahal;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yanmonsta extends drai.dev.data.pokemon.Pokemon {
    public Yanmonsta() {
        super("Yanmonsta",
                Type.BUG,Type.DRAGON,
                new Stats(73,
                        39,
                        78,
                        133,
                        78,
                        112),
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
           setLangFileName("Yanmonsta");

    }


}
