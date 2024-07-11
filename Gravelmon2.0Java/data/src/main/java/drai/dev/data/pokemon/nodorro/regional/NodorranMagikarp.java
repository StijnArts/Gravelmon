package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranMagikarp extends drai.dev.data.pokemon.Pokemon {
    public NodorranMagikarp(String name, Aspect aspect) {
        super(name, aspect, "Magikarp",
                Type.POISON, Type.WATER,
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
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magikarp");

    }


}
