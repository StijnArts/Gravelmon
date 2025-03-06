package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ostretch extends drai.dev.data.pokemon.Pokemon {
    public Ostretch() {
        super("Ostretch",
                Type.NORMAL, Type.FLYING,
                new Stats(70,
                        105,
                        75,
                        50,
                        75,
                        100),
                List.of(Ability.LONG_REACH), Ability.QUICK_FEET,
                27, 1450,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ostretch are extremely fast for their size. They can run over a hundred miles per hour and not tire."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ostretch");

    }


}
