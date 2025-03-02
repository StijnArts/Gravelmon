package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shroomlet extends drai.dev.data.pokemon.Pokemon {
    public Shroomlet() {
        super("Shroomlet",
                Type.GHOST, Type.GRASS,
                new Stats(60,
                        30,
                        20,
                        100,
                        30,
                        60),
                List.of(Ability.EFFECT_SPORE,Ability.INTIMIDATE), Ability.INFILTRATOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shroomlet");

    }


}
