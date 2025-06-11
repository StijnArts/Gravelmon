package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kyubicane extends drai.dev.data.pokemon.Pokemon {
    public Kyubicane() {
        super("Kyubicane",
                Type.WATER,
                new Stats(84,
                        44,
                        72,
                        124,
                        80,
                        72),
                List.of(), null,
                11, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kyubicane");

    }


}
