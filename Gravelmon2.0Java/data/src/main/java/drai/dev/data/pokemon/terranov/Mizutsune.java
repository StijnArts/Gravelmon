package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mizutsune extends drai.dev.data.pokemon.Pokemon {
    public Mizutsune() {
        super("Mizutsune",
                Type.WATER, Type.FAIRY,
                new Stats(98,
                        65,
                        71,
                        125,
                        71,
                        115),
                List.of(Ability.COMPETITIVE), Ability.COMPETITIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mizutsune are actually not very aggressive, but will go out on a rampage during mating seasons. They can create and spread bubbles which can slow down and cause their foes to trip."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mizutsune");

    }


}
