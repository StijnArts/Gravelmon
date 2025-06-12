package drai.dev.data.pokemon.borazul;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moskiringe extends drai.dev.data.pokemon.Pokemon {
    public Moskiringe() {
        super("Moskiringe",
                Type.BUG,Type.POISON,
                new Stats(70,
                        37,
                        74,
                        106,
                        74,
                        126),
                List.of(), null,
                9, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BORAZUL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanFly(true);
        setCanWalkOnWater(true);
        setLangFileName("Moskiringe");

    }


}
