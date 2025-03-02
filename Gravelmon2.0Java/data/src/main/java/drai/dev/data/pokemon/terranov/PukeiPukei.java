package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class PukeiPukei extends drai.dev.data.pokemon.Pokemon {
    public PukeiPukei() {
        super("PukeiPukei",
                Type.POISON, Type.GRASS,
                new Stats(60,
                        50,
                        78,
                        102,
                        90,
                        80),
                List.of(Ability.GLUTTONY), Ability.HARVEST,
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
           setLangFileName("Pukei-Pukei");

    }


}
