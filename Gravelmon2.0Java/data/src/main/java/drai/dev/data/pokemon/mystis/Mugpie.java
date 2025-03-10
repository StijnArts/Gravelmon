package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mugpie extends drai.dev.data.pokemon.Pokemon {
    public Mugpie() {
        super("Mugpie",
                Type.GROUND, Type.DARK,
                new Stats(80,
                        90,
                        60,
                        40,
                        60,
                        100),
                List.of(Ability.PICKPOCKET,Ability.FRISK), Ability.AVARICE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                151, ExperienceGroup.ERRATIC,
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
           setLangFileName("Mugpie");

    }


}
