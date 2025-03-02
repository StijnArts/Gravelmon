package drai.dev.data.pokemon.mahal.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MahalianSpiritomb extends drai.dev.data.pokemon.Pokemon {
    public MahalianSpiritomb(String name, Aspect aspect) {
        super(name, aspect, "MahalianSpiritomb",
                Type.ELECTRIC,Type.GHOST,
                new Stats(69,
                        37,
                        73,
                        105,
                        92,
                        105),
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
                List.of(Label.MAHAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Spiritomb");

    }


}
