package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hogriks extends drai.dev.data.pokemon.Pokemon {
    public Hogriks(Stats stats) {
        super("Hogriks",
                Type.GROUND, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Losing the grass typing on evolution has made Hogriks' body much less susceptible to being blown down. Often found resting near small villages, Hogriks will let small Pokemon take refuge inside its fortified body."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hogriks");

    }


}
