package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crabbarrie extends drai.dev.data.pokemon.Pokemon {
    public Crabbarrie() {
        super("Crabbarrie",
                Type.WATER, Type.STEEL,
                new Stats(70,
                        50,
                        110,
                        20,
                        90,
                        10),
                List.of(Ability.RAZORFINS,Ability.SHELL_ARMOR), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Its carapace is so tough, it doesn't even realize when it's being stepped on! / It rarely moves on its own will, preferring to stay in the mud as it feeds on tiny organisms in the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHIELD_BASH,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crabbarrie");

    }


}
