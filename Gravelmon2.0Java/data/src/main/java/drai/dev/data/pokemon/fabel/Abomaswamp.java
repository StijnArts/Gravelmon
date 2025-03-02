package drai.dev.data.pokemon.fabel;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Abomaswamp extends drai.dev.data.pokemon.Pokemon {
    public Abomaswamp() {
        super("Abomaswamp",
                Type.GRASS,Type.WATER,
                new Stats(107,
                        127,
                        69,
                        41,
                        78,
                        69),
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
                List.of(Label.FABEL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Abomaswamp");

    }


}
