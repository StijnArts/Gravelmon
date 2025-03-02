package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hogouse extends drai.dev.data.pokemon.Pokemon {
    public Hogouse() {
        super("Hogouse",
                Type.GROUND, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUN_AWAY), Ability.WEAK_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Design, name, type, flavour, and sprites by Scotsman333 These designs/sprites are originally from the Fakemon Festival Pack. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hogouse");

    }


}
