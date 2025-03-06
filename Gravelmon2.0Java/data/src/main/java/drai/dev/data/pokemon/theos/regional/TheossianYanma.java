package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianYanma extends drai.dev.data.pokemon.Pokemon {
    public TheossianYanma(String name, Aspect aspect) {
        super(name, aspect, "Yanma",
                Type.BUG, Type.DRAGON,
                new Stats(65,
                        75,
                        45,
                        65,
                        45,
                        95),
                List.of(Ability.PRESSURE,Ability.TINTED_LENS), Ability.ADAPTABILITY,
                12, 380,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Yanma are quiet rare to find in the wild. It's said only experienced trainers can handle them."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Yanma");

    }


}
