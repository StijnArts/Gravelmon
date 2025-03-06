package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Choaking extends drai.dev.data.pokemon.Pokemon {
    public Choaking() {
        super("Choaking",
                Type.ROCK, Type.FIRE,
                new Stats(65,
                        120,
                        140,
                        85,
                        115,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 2100,
                new Stats(0,1,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Choaking");

    }


}
