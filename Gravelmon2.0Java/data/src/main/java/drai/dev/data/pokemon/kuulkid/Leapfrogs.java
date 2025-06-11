package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leapfrogs extends drai.dev.data.pokemon.Pokemon {
    public Leapfrogs() {
        super("Leapfrogs",
                Type.NORMAL,
                new Stats(86,
                        74,
                        53,
                        56,
                        54,
                        59),
                List.of(Ability.SYNCHRONIZE), Ability.FRIEND_GUARD,
                8, 0,
                new Stats(1,1,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Leapfrogs are paired together at birth and share an unbreakable bond. If one Leapfrog falls, the other will take its place in battle."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Leapfrogs");

    }


}
