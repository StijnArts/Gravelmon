package drai.dev.data.pokemon.fabel.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FabelianChandelure extends drai.dev.data.pokemon.Pokemon {
    public FabelianChandelure(String name, Aspect aspect) {
        super(name, aspect, "FabelianChandelure",
                Type.GHOST,Type.ELECTRIC,
                new Stats(74,
                        39,
                        78,
                        113,
                        78,
                        134),
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
                List.of(Label.FABEL),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chandelure");

    }


}
