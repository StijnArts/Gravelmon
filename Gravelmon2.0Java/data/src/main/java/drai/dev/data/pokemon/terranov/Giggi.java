package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Giggi extends drai.dev.data.pokemon.Pokemon {
    public Giggi() {
        super("Giggi",
                Type.POISON,
                new Stats(20,
                        30,
                        45,
                        60,
                        55,
                        35),
                List.of(Ability.MERCILESS), Ability.HUSTLE,
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
           setLangFileName("Giggi");

    }


}
