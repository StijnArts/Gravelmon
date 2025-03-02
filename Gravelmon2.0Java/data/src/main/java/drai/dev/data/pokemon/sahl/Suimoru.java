package drai.dev.data.pokemon.sahl;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Suimoru extends drai.dev.data.pokemon.Pokemon {
    public Suimoru() {
        super("Suimoru",
                Type.ICE,Type.PSYCHIC,
                new Stats(126,
                        44,
                        97,
                        107,
                        149,
                        54),
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
                List.of(Label.SAHL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Suimoru");

    }


}
