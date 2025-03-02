package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lichuff extends drai.dev.data.pokemon.Pokemon {
    public Lichuff() {
        super("Zombark",
                Type.POISON,
                new Stats(80,
                        45,
                        75,
                        10,
                        95,
                        25),
                List.of(Ability.POISON_POINT), Ability.RUN_AWAY,
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
           setLangFileName("Zombark");

    }


}
