package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koucoon extends drai.dev.data.pokemon.Pokemon {
    public Koucoon() {
        super("Koucoon",
                Type.POISON,Type.ELECTRIC,
                new Stats(63,
                        55,
                        95,
                        62,
                        75,
                        30),
                List.of(Ability.STATIC), Ability.POISON_POINT,
                8, 0,
                new Stats(0,0,1,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Koucoon");

    }


}
