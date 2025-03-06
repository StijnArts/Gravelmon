package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flyterror extends drai.dev.data.pokemon.Pokemon {
    public Flyterror() {
        super("Flyterror",
                Type.BUG, Type.FLYING,
                new Stats(79,
                        116,
                        75,
                        80,
                        75,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("45 Dual WingbeatSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,45)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flyterror");

    }


}
