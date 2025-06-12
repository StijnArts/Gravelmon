package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fiestavia extends drai.dev.data.pokemon.Pokemon {
    public Fiestavia() {
        super("Fiestavia",
                Type.FAIRY,
                new Stats(61,
                        93,
                        65,
                        32,
                        65,
                        111),
                List.of(), null,
                11, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fiestavia");

    }


}
