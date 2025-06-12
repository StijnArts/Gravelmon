package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dobnaly extends drai.dev.data.pokemon.Pokemon {
    public Dobnaly(Stats stats) {
        super("Dobnaly",
                Type.BUG,Type.POISON,
                stats,
                List.of(Ability.SPEED_BOOST,Ability.COMPOUND_EYES), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
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
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Dobnaly");

    }


}
