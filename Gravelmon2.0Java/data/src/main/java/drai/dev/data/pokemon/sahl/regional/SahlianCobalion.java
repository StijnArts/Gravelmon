package drai.dev.data.pokemon.sahl.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class SahlianCobalion extends drai.dev.data.pokemon.Pokemon {
    public SahlianCobalion(String name, Aspect aspect) {
        super(name, aspect, "SahlianCobalion",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(83,
                        126,
                        87,
                        44,
                        87,
                        149),
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
                List.of(Label.SAHL),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cobalion");

    }


}
