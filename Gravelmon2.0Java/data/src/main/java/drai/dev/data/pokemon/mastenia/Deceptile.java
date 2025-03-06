package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deceptile extends drai.dev.data.pokemon.Pokemon {
    public Deceptile() {
        super("Deceptile",
                Type.FIGHTING, Type.DARK,
                new Stats(70,
                        115,
                        65,
                        95,
                        75,
                        110),
                List.of(Ability.FINALE), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Throat ChopSTAB Dark - Cross ChopSTAB Fighting - X-Scissor Bug - Dual Chop Dragon - Fury Cutter Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROSS_CHOP,1),
                        new MoveLearnSetEntry(Move.XSCISSOR,1),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,1),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Deceptile");

    }


}
