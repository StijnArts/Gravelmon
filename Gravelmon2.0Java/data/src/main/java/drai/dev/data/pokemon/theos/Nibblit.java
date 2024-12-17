package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nibblit extends drai.dev.data.pokemon.Pokemon {
    public Nibblit() {
        super("Nibblit",
                Type.NORMAL,
                new Stats(60,
                        65,
                        65,
                        30,
                        45,
                        55),
                List.of(Ability.SAP_SIPPER), Ability.STRONG_JAW,
                8, 90,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nibblit are constantly looking for something to chew, forcing Trainers to carry sticks with them in order to avoid Nibblit destroying their belongings."),
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
           setLangFileName("Nibblit");

    }


}
