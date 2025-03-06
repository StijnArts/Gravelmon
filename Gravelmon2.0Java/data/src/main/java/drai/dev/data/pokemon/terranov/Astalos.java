package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astalos extends drai.dev.data.pokemon.Pokemon {
    public Astalos() {
        super("Astalos",
                Type.ELECTRIC, Type.FLYING,
                new Stats(80,
                        100,
                        70,
                        110,
                        70,
                        115),
                List.of(Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Astalos");

    }


}
