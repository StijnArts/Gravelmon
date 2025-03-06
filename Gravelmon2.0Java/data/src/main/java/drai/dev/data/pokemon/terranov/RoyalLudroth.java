package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RoyalLudroth extends drai.dev.data.pokemon.Pokemon {
    public RoyalLudroth() {
        super("RoyalLudroth",
                Type.WATER,
                new Stats(70,
                        80,
                        60,
                        80,
                        100,
                        80),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("RoyalLudroth");

    }


}
