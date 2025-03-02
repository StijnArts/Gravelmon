package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sourprion extends drai.dev.data.pokemon.Pokemon {
    public Sourprion() {
        super("Sourprion",
                Type.WATER, Type.DRAGON,
                new Stats(75,
                        99,
                        70,
                        80,
                        70,
                        81),
                List.of(Ability.FRISK), Ability.STRONG_JAW,
                37, 1600,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("While entirely blind, Sourprion can release a powerful fragrance that can paralyze foes with it's flavour. They can feel their surroundings with special electro-receptors. Male Sourprion have more potent fragrances for attracting mates."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sourprion");

    }


}
