package drai.dev.data.pokemon.raian;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CaveEnvirock extends drai.dev.data.pokemon.Pokemon {
    public CaveEnvirock(String s, Aspect cave, Stats stats) {
        super(s, cave, "Envirock",
                Type.ROCK, Type.DARK,
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
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setLangFileName("Envirock");

    }
}
