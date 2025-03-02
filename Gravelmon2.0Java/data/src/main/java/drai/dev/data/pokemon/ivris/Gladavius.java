package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gladavius extends drai.dev.data.pokemon.Pokemon {
    public Gladavius() {
        super("Gladavius",
                Type.BUG,Type.STEEL,
                new Stats(102,
                        86,
                        121,
                        36,
                        79,
                        43),
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
           setLangFileName("Gladavius");

    }


}
