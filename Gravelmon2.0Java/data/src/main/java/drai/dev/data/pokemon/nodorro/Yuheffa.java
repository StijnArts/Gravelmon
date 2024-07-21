package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yuheffa extends drai.dev.data.pokemon.Pokemon {
    public Yuheffa() {
        super("Ufo2",
                Type.STEEL, Type.ELECTRIC,
                new Stats(90,
                        51,
                        102,
                        114,
                        102,
                        51),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                15, 1200,
                new Stats(1,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
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
           setLangFileName("Ufo 2");

    }


}
