package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glavenus extends drai.dev.data.pokemon.Pokemon {
    public Glavenus() {
        super("Glavenus",
                Type.FIRE, Type.STEEL,
                new Stats(90,
                        120,
                        90,
                        90,
                        65,
                        90),
                List.of(Ability.HYPER_CUTTER), Ability.HYPER_CUTTER,
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
           setLangFileName("Glavenus");

    }


}
