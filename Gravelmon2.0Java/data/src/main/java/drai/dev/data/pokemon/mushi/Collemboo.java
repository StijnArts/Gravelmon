package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Collemboo extends drai.dev.data.pokemon.Pokemon {
    public Collemboo() {
        super("Collemboo",
                Type.GHOST,
                new Stats(35,
                        40,
                        40,
                        55,
                        85,
                        25),
                List.of(Ability.CURSED_BODY,Ability.FRISK), Ability.RUN_AWAY,
                0, 0,
                new Stats(0,0,0,0,1,0), 225,
                0.5,
                59, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Collemboo");

    }


}
