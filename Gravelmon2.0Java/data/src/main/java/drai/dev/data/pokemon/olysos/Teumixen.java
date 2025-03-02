package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Teumixen extends drai.dev.data.pokemon.Pokemon {
    public Teumixen() {
        super("Teumixen",
                Type.GHOST,
                new Stats(82,
                        58,
                        55,
                        80,
                        92,
                        54),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 350,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Teumixen");

    }


}
