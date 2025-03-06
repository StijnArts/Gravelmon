package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scarfly extends drai.dev.data.pokemon.Pokemon {
    public Scarfly() {
        super("Scarfly",
                Type.FLYING, Type.ICE,
                new Stats(55,
                        33,
                        67,
                        58,
                        57,
                        50),
                List.of(Ability.BIG_PECKS), Ability.ICE_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                112, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scarfly");

    }


}
