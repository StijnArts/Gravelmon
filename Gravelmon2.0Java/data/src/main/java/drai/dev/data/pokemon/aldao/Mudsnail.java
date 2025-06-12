package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mudsnail extends drai.dev.data.pokemon.Pokemon {
    public Mudsnail() {
        super("Mudsnail",
                Type.BUG,Type.GROUND,
                new Stats(118,
                        33,
                        52,
                        52,
                        157,
                        19),
                List.of(), null,
                UnitConverter.feetToMeters(3, 1), 0,
                new Stats(0,0,0,0,0,0), 60,
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
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MANGROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mudsnail");

    }


}
