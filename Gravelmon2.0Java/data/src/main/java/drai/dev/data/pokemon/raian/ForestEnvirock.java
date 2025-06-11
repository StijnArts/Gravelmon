package drai.dev.data.pokemon.raian;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ForestEnvirock extends drai.dev.data.pokemon.Pokemon {
    public ForestEnvirock(String s, Aspect forest, Stats stats) {
        super(s, forest, "Envirock",
                Type.ROCK, Type.GRASS,
                stats,
                List.of(), null,
                5, 0,
                new Stats(0,0,0,0,0,0), 100,
                -1,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setLangFileName("Envirock");

    }
}
