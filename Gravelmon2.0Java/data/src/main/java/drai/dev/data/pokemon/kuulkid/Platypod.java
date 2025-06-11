package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Platypod extends drai.dev.data.pokemon.Pokemon {
    public Platypod() {
        super("Platypod",
                Type.BUG,
                new Stats(85,
                        75,
                        68,
                        55,
                        96,
                        65),
                List.of(Ability.EARTH_EATER), Ability.EARTH_EATER,
                12, 0,
                new Stats(0,0,0,0,2,0), 60,
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
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Platypod");

    }


}
