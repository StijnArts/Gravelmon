package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lemish extends drai.dev.data.pokemon.Pokemon {
    public Lemish() {
        super("Lemish",
                Type.WATER, Type.DRAGON,
                new Stats(45,
                        55,
                        35,
                        40,
                        35,
                        35),
                List.of(Ability.FRISK), Ability.STRONG_JAW,
                12, 0,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                49, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Small and weak, Lemish are commonly found in the middle of Sourprion schools, acting as a shield for the young. While swimming, they stay low to the sea bed, blending in to the sand."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lemish");

    }


}
