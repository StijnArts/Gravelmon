package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pinxie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pinxie() {
        super("Pinxie",
                Type.FAIRY,
                new Stats(30,
                        30,
                        25,
                        55,
                        40,
                        75),
                List.of(Ability.IMMUNITY,Ability.FILTER,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scientists believe they were formed from the cosmic dust after a star dies. Why or how they ended up in Orohn-Havai is still a mystery."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinxie");

    }


}
