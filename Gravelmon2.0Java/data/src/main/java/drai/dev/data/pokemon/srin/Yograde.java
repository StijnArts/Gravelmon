package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yograde extends drai.dev.data.pokemon.Pokemon {
    public Yograde() {
        super("Yograde",
                Type.ROCK,Type.NORMAL,
                new Stats(105,
                        25,
                        105,
                        25,
                        105,
                        65),
                List.of(Ability.WATER_ABSORB), Ability.NORMALIZE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Yograde");

    }


}
