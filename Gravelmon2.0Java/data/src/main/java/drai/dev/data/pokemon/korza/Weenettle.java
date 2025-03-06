package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Weenettle extends drai.dev.data.pokemon.Pokemon {
    public Weenettle() {
        super("Weenettle",
                Type.GRASS,
                new Stats(46,
                        23,
                        44,
                        42,
                        47,
                        34),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                47, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Each variety tends to have a certain type of personality, though it's not always the case. Weenettle's psychic abilities are limited, and just powerful enough to make it float."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Weenettle");

    }


}
