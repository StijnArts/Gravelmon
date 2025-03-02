package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Serrarbo extends drai.dev.data.pokemon.Pokemon {
    public Serrarbo() {
        super("Serrarbo",
                Type.ROCK, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CHLOROPHYLL), Ability.SOLAR_POWER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Older Serrarbo have sharper leaves and harder bark. They could survive intense forest fires."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Serrarbo");

    }


}
