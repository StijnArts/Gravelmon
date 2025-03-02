package drai.dev.data.pokemon.elb;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cervelot extends drai.dev.data.pokemon.Pokemon {
    public Cervelot() {
        super("Cervelot",
                Type.PSYCHIC,
                new Stats(161,
                        35,
                        56,
                        56,
                        188,
                        17),
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
                List.of(Label.ELB),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cervelot");

    }


}
