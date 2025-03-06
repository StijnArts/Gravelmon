package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bisonami extends drai.dev.data.pokemon.Pokemon {
    public Bisonami(Stats stats) {
        super("Bisonami",
                Type.WATER, Type.GROUND,
                stats,
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bisonami");

    }


}
