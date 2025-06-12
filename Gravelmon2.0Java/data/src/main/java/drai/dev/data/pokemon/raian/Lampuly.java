package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lampuly extends drai.dev.data.pokemon.Pokemon {
    public Lampuly(Stats stats) {
        super("Lampuly",
                Type.BUG,Type.FAIRY,
                stats,
                List.of(Ability.GLOW), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_DESERT)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanFly(true);
        setCanWalkOnWater(true);
           setLangFileName("Lampuly");

    }


}
