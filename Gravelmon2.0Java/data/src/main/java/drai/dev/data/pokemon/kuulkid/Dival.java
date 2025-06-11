package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dival extends drai.dev.data.pokemon.Pokemon {
    public Dival() {
        super("Dival",
                Type.FIRE,Type.FAIRY,
                new Stats(65,
                        68,
                        42,
                        108,
                        82,
                        89),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                13, 0,
                new Stats(0,0,0,2,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_FOREST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dival");

    }


}
