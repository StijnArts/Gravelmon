package drai.dev.data.pokemon.ferran;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mazzogre extends drai.dev.data.pokemon.Pokemon {
    public Mazzogre() {
        super("Mazzogre",
                Type.FIGHTING,Type.FAIRY,
                new Stats(93,
                        78,
                        128,
                        30,
                        71,
                        38),
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
           setLangFileName("Mazzogre");

    }


}
