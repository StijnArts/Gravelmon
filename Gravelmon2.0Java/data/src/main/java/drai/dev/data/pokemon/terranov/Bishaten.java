package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bishaten extends drai.dev.data.pokemon.Pokemon {
    public Bishaten(Stats stats) {
        super("Bishaten",
                Type.GRASS, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A monster with a distinctive tail. While it is omnivorous, it has a preference for fruit, and keeps various fruits with all kinds of effects in its belly pouch. An incredibly curious beast, it enjoys playing tricks on people, and has been seen to bat fruit at its prey using its tail."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bishaten");

    }


}
