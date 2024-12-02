package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aquastrian extends drai.dev.data.pokemon.Pokemon {
    public Aquastrian() {
        super("Aquastrian",
                Type.WATER, Type.FAIRY,
                new Stats(75,
                        75,
                        65,
                        125,
                        100,
                        95),
                List.of(Ability.TORRENT), Ability.DAZZLING,
                18, 3100,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                240, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Aquastrian are great swimmers, able to pass through large whirlpools with ease. Touching their horn is said to give you good luck."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aquastrian");

    }


}
