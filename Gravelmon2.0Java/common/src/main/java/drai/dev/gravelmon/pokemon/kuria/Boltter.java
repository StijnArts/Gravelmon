package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Boltter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boltter() {
        super("Boltter",
                Type.ELECTRIC,Type.GROUND,
                new Stats(90,
                        98,
                        85,
                        75,
                        91,
                        79),
                List.of(Ability.MOTOR_DRIVE,Ability.STATICTOUCH), Ability.GALVANIZE,
                7, 307,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Playful in nature and easily to get along with, it lives with its family for protection until leaving for a mate during young adulthood. It is said that the longer the whiskers, the more electricity it can generate, thus being an ideal method to show off among each other. Experienced Boltter can propel themselves through the ground at amazing speeds, electrocuting threats along the way."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Boltter");

    }


}
