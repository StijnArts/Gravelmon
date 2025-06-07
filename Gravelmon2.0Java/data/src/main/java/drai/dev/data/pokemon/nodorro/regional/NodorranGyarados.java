package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranGyarados extends drai.dev.data.pokemon.Pokemon {
    public NodorranGyarados(String name, Aspect aspect) {
        super(name, aspect, "Gyarados",
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
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN)
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Gyarados");

    }


}
