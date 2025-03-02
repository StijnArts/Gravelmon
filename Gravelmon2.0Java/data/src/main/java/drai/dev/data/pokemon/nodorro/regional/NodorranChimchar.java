package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranChimchar extends drai.dev.data.pokemon.Pokemon {
    public NodorranChimchar(String name, Aspect aspect) {
        super(name, aspect, "Chimchar",
                Type.FIRE, Type.DARK,
                new Stats(45,
                        64,
                        40,
                        50,
                        50,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chimchar");

    }


}
