package drai.dev.data.pokemon.fabel;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fluffyscales extends drai.dev.data.pokemon.Pokemon {
    public Fluffyscales() {
        super("Fluffyscales",
                Type.DRAGON,Type.FAIRY,
                new Stats(120,
                        101,
                        166,
                        39,
                        92,
                        49),
                List.of(Ability.PROTOSYNTHESIS), null,
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
           setLangFileName("Fluffy scales");

    }


}
