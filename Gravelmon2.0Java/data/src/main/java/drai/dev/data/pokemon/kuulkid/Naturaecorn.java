package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Naturaecorn extends drai.dev.data.pokemon.Pokemon {
    public Naturaecorn() {
        super("Naturaecorn",
                Type.GRASS,Type.BUG,
                new Stats(96,
                        78,
                        66,
                        96,
                        80,
                        64),
                List.of(Ability.SWARM), Ability.SWARM,
                17, 0,
                new Stats(0,0,0,2,0,0), 30,
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
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Naturaecorn");

    }


}
