package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fandrake extends drai.dev.data.pokemon.Pokemon {
    public Fandrake() {
        super("Fandrake",
                Type.DRAGON,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Fandrakes used to live in harsh, desolate environments where adaptations between males and females helped them to thrive. Large leaves on the males' tails help collect water, while females grow large, poisonous berries to use as weapons and protection."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fandrake");

    }


}
