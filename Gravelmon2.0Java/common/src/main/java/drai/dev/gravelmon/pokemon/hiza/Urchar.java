package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Urchar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Urchar() {
        super("Urchar",
                Type.FIRE,Type.POISON,
                new Stats(72,
                        90,
                        131,
                        52,
                        110,
                        32),
                List.of(Ability.POISON_POINT), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("It travels on the ocean floor searching warmer waters and hydrothermal vents. Its super potent venom is its greatest weapon against Kalamark that dominate those areas."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Urchar");

    }


}
