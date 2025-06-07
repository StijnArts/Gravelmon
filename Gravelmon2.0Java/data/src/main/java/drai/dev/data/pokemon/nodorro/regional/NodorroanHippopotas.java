package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanHippopotas extends drai.dev.data.pokemon.Pokemon {
    public NodorroanHippopotas(String name, Aspect aspect) {
        super(name, aspect, "NodorroanHippopotas",
                Type.WATER,
                new Stats(68,
                        60,
                        42,
                        52,
                        78,
                        32),
                List.of(Ability.WATER_VEIL), Ability.WATER_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hippopotas");

    }


}
