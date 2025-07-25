package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rapnagon extends drai.dev.data.pokemon.Pokemon {
    public Rapnagon(Stats stats) {
        super("Rapnagon",
                Type.ROCK,Type.DRAGON,
                stats,
                List.of(Ability.ARENA_TRAP), null,
                35, 0,
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
    .setMinLevel(55)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .setSpawnPreset(SpawnPreset.NETHER_FORTRESS)
    .build(), List.of());
	
           setLangFileName("Rapnagon");

    }


}
