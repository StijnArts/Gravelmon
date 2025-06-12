package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dracnarok extends drai.dev.data.pokemon.Pokemon {
    public Dracnarok(Stats stats) {
        super("Dracnarok",
                Type.ROCK,Type.DRAGON,
                stats,
                List.of(), null,
                38, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(65)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Dracnarok");

    }


}
