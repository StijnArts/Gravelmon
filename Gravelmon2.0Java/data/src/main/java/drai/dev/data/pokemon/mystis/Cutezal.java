package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cutezal extends drai.dev.data.pokemon.Pokemon {
    public Cutezal() {
        super("Cutezal",
                Type.FLYING,
                new Stats(40,
                        50,
                        45,
                        60,
                        45,
                        40),
                List.of(Ability.BIG_PECKS), Ability.BIG_PECKS,
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
           setLangFileName("Cutezal");

    }


}
