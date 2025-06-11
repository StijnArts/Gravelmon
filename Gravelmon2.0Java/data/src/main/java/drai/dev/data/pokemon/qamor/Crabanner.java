package drai.dev.data.pokemon.qamor;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crabanner extends drai.dev.data.pokemon.Pokemon {
    public Crabanner() {
        super("Crabanner",
                Type.NORMAL,
                new Stats(200,
                        48,
                        100,
                        50,
                        90,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                38, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crabanner");

    }


}
