package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boltbat extends drai.dev.data.pokemon.Pokemon {
    public Boltbat(Stats stats) {
        super("Boltbat",
                Type.ELECTRIC, Type.FLYING,
                stats,
                List.of(Ability.STATIC), Ability.FLUFFY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Boltbat");

    }


}
