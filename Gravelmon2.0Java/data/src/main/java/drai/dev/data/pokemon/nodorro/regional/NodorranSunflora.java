package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranSunflora extends drai.dev.data.pokemon.Pokemon {
    public NodorranSunflora(String name, Aspect aspect) {
        super(name, aspect, "Sunflora",
                Type.GRASS, Type.GROUND,
                new Stats(74,
                        70,
                        115,
                        70,
                        105,
                        10),
                List.of(Ability.IRON_BARBS), Ability.SOLAR_POWER,
                9, 123,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Sunflora have evolved to grow thicker prickly roots to defend themselves from imicada who prey on them."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sunflora");

    }


}
