package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baitensnatch extends drai.dev.data.pokemon.Pokemon {
    public Baitensnatch() {
        super("Baitensnatch",
                Type.GRASS,Type.DARK,
                new Stats(53,
                        99,
                        55,
                        43,
                        40,
                        101),
                List.of(Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                8, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Baitensnatch");

    }


}
