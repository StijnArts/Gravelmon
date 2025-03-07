package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shrimpod extends drai.dev.data.pokemon.Pokemon {
    public Shrimpod() {
        super("Shrimpod",
                Type.WATER,
                new Stats(50,
                        75,
                        25,
                        55,
                        25,
                        10),
                List.of(Ability.CLEAR_BODY,Ability.HYPER_CUTTER), Ability.COMPOUND_EYES,
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
           setLangFileName("Shrimpod");

    }


}
