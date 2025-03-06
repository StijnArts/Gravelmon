package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ventilio extends drai.dev.data.pokemon.Pokemon {
    public Ventilio() {
        super("Ventilio",
                Type.WATER, Type.STEEL,
                new Stats(50,
                        67,
                        43,
                        63,
                        47,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It is exceedingly quick, and only the most skilled anglers can see it. Because of its blade-like fins, it can readily avoid most traps."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ventilio");

    }


}
