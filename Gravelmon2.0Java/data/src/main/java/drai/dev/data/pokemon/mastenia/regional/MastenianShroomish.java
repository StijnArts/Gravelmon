package drai.dev.data.pokemon.mastenia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianShroomish extends drai.dev.data.pokemon.Pokemon {
    public MastenianShroomish(String name, Aspect aspect) {
        super(name, aspect, "Shroomish",
                Type.DRAGON, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EFFECT_SPORE,Ability.OUTBURST), Ability.QUICK_FEET,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shroomish");

    }


}
