package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bigpop extends drai.dev.data.pokemon.Pokemon {
    public Bigpop() {
        super("Bigpop",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(75,
                        100,
                        60,
                        90,
                        80,
                        120),
                List.of(Ability.SUPERCHARGE), Ability.NO_GUARD,
                18, 0,
                new Stats(0,1,0,0,0,2), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bigpop");

    }


}
