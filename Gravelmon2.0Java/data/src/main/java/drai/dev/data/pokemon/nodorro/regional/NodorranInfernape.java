package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranInfernape extends drai.dev.data.pokemon.Pokemon {
    public NodorranInfernape(String name, Aspect aspect) {
        super(name, aspect, "Infernape",
                Type.FIRE,Type.DARK,
                new Stats(80,
                        120,
                        70,
                        84,
                        80,
                        99),
                List.of(Ability.FLAME_BODY), Ability.IRON_FIST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
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
           setLangFileName("Infernape");

    }


}
