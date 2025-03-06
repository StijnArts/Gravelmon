package drai.dev.data.pokemon.ottora;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pinjure extends drai.dev.data.pokemon.Pokemon {
    public Pinjure() {
        super("Pinjure",
                Type.NORMAL, Type.POISON,
                new Stats(55,
                        46,
                        54,
                        40,
                        20,
                        40),
                List.of(Ability.CUTE_CHARM,Ability.POISON_POINT), Ability.RATTLED,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinjure");

    }


}
