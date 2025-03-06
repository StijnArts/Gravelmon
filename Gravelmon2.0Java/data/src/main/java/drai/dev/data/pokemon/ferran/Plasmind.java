package drai.dev.data.pokemon.ferran;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plasmind extends drai.dev.data.pokemon.Pokemon {
    public Plasmind() {
        super("Plasmind",
                Type.PSYCHIC,Type.DRAGON,
                new Stats(79,
                        42,
                        68,
                        98,
                        93,
                        68),
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
           setLangFileName("Plasmind");

    }


}
