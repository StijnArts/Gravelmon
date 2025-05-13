package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanMagikarp extends drai.dev.data.pokemon.Pokemon {
    public NodorroanMagikarp(String name, Aspect aspect) {
        super(name, aspect, "NodorroanMagikarp",
                Type.POISON,Type.WATER,
                new Stats(30,
                        30,
                        40,
                        20,
                        20,
                        60),
                List.of(Ability.POISON_POINT,Ability.SWIFT_SWIM), Ability.ANGER_POINT,
                12, 45,
                new Stats(0,0,1,0,0,0), 150,
                0.5,
                40, ExperienceGroup.SLOW,
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
           setLangFileName("Magikarp");

    }


}
