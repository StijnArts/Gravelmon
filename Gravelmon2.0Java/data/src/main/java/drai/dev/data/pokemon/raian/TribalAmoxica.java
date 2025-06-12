package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TribalAmoxica extends drai.dev.data.pokemon.Pokemon {
    public TribalAmoxica(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Amoxica",
                Type.WATER,Type.POISON,
                stats,
                List.of(), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(55)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Amoxica");

    }


}
