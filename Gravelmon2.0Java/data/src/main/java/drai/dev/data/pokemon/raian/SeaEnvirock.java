package drai.dev.data.pokemon.raian;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeaEnvirock extends drai.dev.data.pokemon.Pokemon {
    public SeaEnvirock(String s, Aspect sea, Stats stats) {
        super(s, sea, "Envirock",
                Type.ROCK, Type.WATER,
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
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setLangFileName("Envirock");

    }
}
