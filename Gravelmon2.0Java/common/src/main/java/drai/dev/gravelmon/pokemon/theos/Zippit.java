package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Zippit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zippit() {
        super("Zippit",
                Type.DARK,Type.ELECTRIC,
                new Stats(40,
                        45,
                        30,
                        45,
                        30,
                        75),
                List.of(Ability.VOLT_ABSORB), Ability.SURGE_SURFER,
                5, 85,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Zippit like to sleep on powerlines at night absorbing electricity. People often wake to find they have no power in their house due to Zippit causing overnight blackouts."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zippit");

    }


}
