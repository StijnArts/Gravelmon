package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianTauros extends drai.dev.data.pokemon.Pokemon {
    public TheossianTauros(String name, Aspect aspect) {
        super(name, aspect, "Tauros",
                Type.DARK, Type.NORMAL,
                new Stats(75,
                        110,
                        105,
                        30,
                        70,
                        100),
                List.of(Ability.RECKLESS), Ability.SHEER_FORCE,
                14, 884,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Tauros have very strong skulls, using them to charge opponents. At the end of their 3 tails are iron balls which they use as a flail if attacked from behind."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tauros");

    }


}
