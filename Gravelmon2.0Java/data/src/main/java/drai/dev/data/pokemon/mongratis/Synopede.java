package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Synopede extends drai.dev.data.pokemon.Pokemon {
    public Synopede() {
        super("Synopede",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legend says that if you happen upon Synopede as they adopt a wishing-like pose you can do the same and have your own wish granted. What they may be wishing for, if that is what they are doing, is unknown."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Synopede");

    }


}
