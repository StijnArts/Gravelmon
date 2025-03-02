package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tidaltar extends drai.dev.data.pokemon.Pokemon {
    public Tidaltar() {
        super("Tidaltar",
                Type.WATER, Type.DRAGON,
                new Stats(106,
                        110,
                        90,
                        124,
                        90,
                        80),
                List.of(Ability.DRIZZLE), Ability.UNNERVE,
                23, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tidaltar");

    }


}
