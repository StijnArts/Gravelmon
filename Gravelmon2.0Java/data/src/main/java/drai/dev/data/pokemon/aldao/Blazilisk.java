package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blazilisk extends drai.dev.data.pokemon.Pokemon {
    public Blazilisk() {
        super("Blazilisk",
                Type.FIRE,Type.DRAGON,
                new Stats(81,
                        61,
                        69,
                        100,
                        77,
                        69),
                List.of(), null,
                UnitConverter.feetToMeters(3, 8), 0,
                new Stats(0,0,0,0,0,0), 45,
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
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Blazilisk");

    }


}
