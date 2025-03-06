package drai.dev.data.pokemon.ferran;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Machaunt extends drai.dev.data.pokemon.Pokemon {
    public Machaunt() {
        super("Machaunt",
                Type.GHOST,Type.STEEL,
                new Stats(148,
                        56,
                        152,
                        36,
                        36,
                        20),
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
           setLangFileName("Machaunt");

    }


}
