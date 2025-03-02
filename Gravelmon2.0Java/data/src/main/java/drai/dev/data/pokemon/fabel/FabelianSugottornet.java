package drai.dev.data.pokemon.fabel;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FabelianSugottornet extends drai.dev.data.pokemon.Pokemon {
    public FabelianSugottornet(String name, Aspect aspect) {
        super(name, aspect, "Fabeliansugottornet",
                Type.BUG,Type.NORMAL,
                new Stats(95,
                        70,
                        104,
                        58,
                        112,
                        58),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FABEL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sugottornet");

    }


}
