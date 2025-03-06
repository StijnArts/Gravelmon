package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mondrog extends drai.dev.data.pokemon.Pokemon {
    public Mondrog(Stats stats) {
        super("Mondrog",
                Type.GRASS, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                80, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mondrog collect and store seeds on their backs which slowly grow into small, unique habitats. The hollows in its body are sometimes used as burrows or collect rainwater."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mondrog");

    }


}
