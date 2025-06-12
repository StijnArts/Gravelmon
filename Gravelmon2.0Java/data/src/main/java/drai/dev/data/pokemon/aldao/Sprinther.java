package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sprinther extends drai.dev.data.pokemon.Pokemon {
    public Sprinther() {
        super("Sprinther",
                Type.ELECTRIC,
                new Stats(64,
                        34,
                        68,
                        116,
                        68,
                        98),
                List.of(), null,
                UnitConverter.feetToMeters(2, 6), 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ALDAO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Sprinther");

    }


}
