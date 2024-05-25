package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Gyarados extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gyarados(int dex) {
        super(dex, "Gyarados",
                Type.POISON, Type.DRAGON,
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
           setLangFileName("Gyarados");

    }


}
