package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Espinas extends drai.dev.data.pokemon.Pokemon {
    public Espinas(Stats stats) {
        super("Espinas",
                Type.POISON, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They are often seen sprawled out and relaxing in their domain. Once they sense danger, however, they expand their blood vessels to turn their hide and wing membranes a bright red, and they will run riot with noteworthy brutality."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Espinas");

    }


}
