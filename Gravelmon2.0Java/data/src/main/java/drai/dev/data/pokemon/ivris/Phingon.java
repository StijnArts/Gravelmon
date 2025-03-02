package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Phingon extends drai.dev.data.pokemon.Pokemon {
    public Phingon() {
        super("Phingon",
                Type.STEEL,Type.PSYCHIC,
                new Stats(93,
                        50,
                        125,
                        32,
                        43,
                        75),
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
           setLangFileName("Phingon");

    }


}
