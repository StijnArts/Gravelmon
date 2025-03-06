package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Palamute extends drai.dev.data.pokemon.Pokemon {
    public Palamute() {
        super("Palamute",
                Type.NORMAL, Type.FIGHTING,
                new Stats(60,
                        105,
                        65,
                        70,
                        95,
                        105),
                List.of(Ability.MOXIE), Ability.MOXIE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Palamute");

    }


}
