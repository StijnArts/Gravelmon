package drai.dev.data.pokemon.sahl;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Meikourkei extends drai.dev.data.pokemon.Pokemon {
    public Meikourkei() {
        super("Meikourkei",
                Type.DARK,Type.POISON,
                new Stats(126,
                        126,
                        126,
                        44,
                        130,
                        25),
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
           setLangFileName("Meikourkei");

    }


}
