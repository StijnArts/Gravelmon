package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Digasdon extends drai.dev.data.pokemon.Pokemon {
    public Digasdon() {
        super("Digasdon",
                Type.STEEL,Type.GROUND,
                new Stats(93,
                        50,
                        108,
                        93,
                        65,
                        18),
                List.of(), null,
                UnitConverter.feetToMeters(8, 6), 0,
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Digasdon");

    }


}
