package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Titanice extends drai.dev.data.pokemon.Pokemon {
    public Titanice(Stats stats) {
        super("Titanice",
                Type.ICE, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                34, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_FROZEN_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanSwim(true);
        setAvoidsLand(true);
           setLangFileName("Titanice");

    }


}
