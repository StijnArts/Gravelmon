package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cavicurl extends drai.dev.data.pokemon.Pokemon {
    public Cavicurl() {
        super("Cavicurl",
                Type.NORMAL,
                new Stats(75,
                        95,
                        60,
                        60,
                        60,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,1,0,0,0,1), 90,
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
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cavicurl");

    }


}
