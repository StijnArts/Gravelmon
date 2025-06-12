package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bowlder extends drai.dev.data.pokemon.Pokemon {
    public Bowlder() {
        super("Bowlder",
                Type.ROCK,
                new Stats(78,
                        88,
                        89,
                        42,
                        53,
                        55),
                List.of(Ability.ROCK_HEAD), Ability.SOLID_ROCK,
                14, 0,
                new Stats(0,0,2,0,0,0), 80,
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
    .setMinLevel(18)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bowlder");

    }


}
