package drai.dev.data.pokemon.ferran.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FerranianLapras extends drai.dev.data.pokemon.Pokemon {
    public FerranianLapras(String name, Aspect aspect) {
        super(name, aspect, "FerranianLapras",
                Type.BUG,Type.DRAGON,
                new Stats(143,
                        63,
                        170,
                        41,
                        41,
                        44),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FERRAN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanWalkOnWater(true);
           setLangFileName("Lapras");

    }


}
