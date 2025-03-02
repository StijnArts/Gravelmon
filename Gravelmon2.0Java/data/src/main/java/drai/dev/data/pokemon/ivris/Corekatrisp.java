package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Corekatrisp extends drai.dev.data.pokemon.Pokemon {
    public Corekatrisp() {
        super("Corekatrisp",
                Type.GRASS,Type.DRAGON,
                new Stats(85,
                        117,
                        76,
                        117,
                        76,
                        67),
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
           setLangFileName("Corekatrisp");

    }


}
