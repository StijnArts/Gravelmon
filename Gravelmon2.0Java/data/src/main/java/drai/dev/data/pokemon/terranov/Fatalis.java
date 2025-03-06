package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fatalis extends drai.dev.data.pokemon.Pokemon {
    public Fatalis(Stats stats) {
        super("Fatalis",
                Type.DRAGON, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A legendary black dragon known only as Fatalis, rumored to have destroyed a kingdom in a single night. Many sought to challеngе it, fеw livеd to tеll thе talе..."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fatalis");

    }


}
