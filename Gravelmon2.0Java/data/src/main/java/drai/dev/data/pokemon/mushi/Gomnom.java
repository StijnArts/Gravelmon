package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gomnom extends drai.dev.data.pokemon.Pokemon {
    public Gomnom() {
        super("Gomnom",
                Type.FAIRY,
                new Stats(65,
                        56,
                        45,
                        56,
                        69,
                        34),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gomnom");

    }


}
