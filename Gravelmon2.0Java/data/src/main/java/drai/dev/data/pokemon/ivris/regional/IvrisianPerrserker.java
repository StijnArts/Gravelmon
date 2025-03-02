package drai.dev.data.pokemon.ivris.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IvrisianPerrserker extends drai.dev.data.pokemon.Pokemon {
    public IvrisianPerrserker(String name, Aspect aspect) {
        super(name, aspect, "IvrisianPerrserker",
                Type.ICE,
                new Stats(77,
                        96,
                        84,
                        41,
                        74,
                        66),
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
                List.of(Label.IVRIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Perrserker");

    }


}
