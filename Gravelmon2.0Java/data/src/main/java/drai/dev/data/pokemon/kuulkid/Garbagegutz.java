package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Garbagegutz extends drai.dev.data.pokemon.Pokemon {
    public Garbagegutz() {
        super("Garbagegutz",
                Type.POISON,Type.STEEL,
                new Stats(85,
                        77,
                        90,
                        66,
                        84,
                        85),
                List.of(Ability.TRASHGUARD), Ability.TRASHGUARD,
                15, 0,
                new Stats(0,0,2,0,0,0), 60,
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
    .setBiomes(Biome.IS_PLAINS)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Garbagegutz");

    }


}
