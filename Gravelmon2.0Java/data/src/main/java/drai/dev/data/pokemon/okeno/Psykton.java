package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psykton extends drai.dev.data.pokemon.Pokemon {
    public Psykton() {
        super("Plankton",
                Type.ROCK,Type.PSYCHIC,
                new Stats(100,
                        125,
                        60,
                        60,
                        60,
                        60),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 0,
                new Stats(0,2,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Plankton");

    }


}
