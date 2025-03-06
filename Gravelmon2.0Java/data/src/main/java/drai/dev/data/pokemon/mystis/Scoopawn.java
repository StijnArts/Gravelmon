package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scoopawn extends drai.dev.data.pokemon.Pokemon {
    public Scoopawn() {
        super("Scoopawn",
                Type.ICE, Type.FIGHTING,
                new Stats(80,
                        75,
                        75,
                        20,
                        70,
                        30),
                List.of(Ability.LONG_REACH,Ability.ICE_BODY), Ability.SNOWPLOW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scoopawn");

    }


}
