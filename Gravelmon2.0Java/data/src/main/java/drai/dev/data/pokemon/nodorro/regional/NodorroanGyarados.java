package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanGyarados extends drai.dev.data.pokemon.Pokemon {
    public NodorroanGyarados(String name, Aspect aspect) {
        super(name, aspect, "NodorroanGyarados",
                Type.POISON,Type.DRAGON,
                new Stats(90,
                        130,
                        80,
                        82,
                        68,
                        90),
                List.of(Ability.POISON_POINT,Ability.INTIMIDATE), Ability.MERCILESS,
                70, 2450,
                new Stats(0,2,0,0,0,0), 40,
                0.5,
                190, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gyarados");

    }


}
