package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianSunflora extends drai.dev.data.pokemon.Pokemon {
    public TheossianSunflora(String name, Aspect aspect) {
        super(name, aspect, "Sunflora",
                Type.GRASS, Type.FIRE,
                new Stats(75,
                        75,
                        55,
                        115,
                        75,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 85,
                new Stats(0,0,0,2,0,0), 255,
                0.5,
                149, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The strong sunlight of Theos allows Theosian Sunflora to convert their excess energy into powerful solar attacks."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sunflora");

    }


}
