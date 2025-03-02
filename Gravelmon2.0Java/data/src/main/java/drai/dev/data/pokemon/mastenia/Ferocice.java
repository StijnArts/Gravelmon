package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ferocice extends drai.dev.data.pokemon.Pokemon {
    public Ferocice(Stats stats) {
        super("Ferocice",
                Type.FIRE, Type.ICE,
                stats,
                List.of(Ability.PRESSURE), Ability.STORM_DRAIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
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
           setLangFileName("Ferocice");

    }


}
