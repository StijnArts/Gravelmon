package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lakanlinog extends drai.dev.data.pokemon.Pokemon {
    public Lakanlinog() {
        super("Lakanlinog",
                Type.GROUND,
                new Stats(120,
                        148,
                        103,
                        63,
                        114,
                        130),
                List.of(), null,
                UnitConverter.feetToMeters(2, 5), 0,
                new Stats(0,0,0,0,0,0), 3,
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
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lakan linog");

    }


}
