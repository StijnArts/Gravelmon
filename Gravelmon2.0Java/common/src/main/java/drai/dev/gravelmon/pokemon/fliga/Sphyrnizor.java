package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sphyrnizor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sphyrnizor() {
        super("Sphyrnizor",
                Type.WATER,Type.ELECTRIC,
                new Stats(70,
                        114,
                        60,
                        100,
                        50,
                        90),
                List.of(Ability.MOTOR_DRIVE), Ability.MAGNET_PULL,
                17, 0,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Sphyrnizor are considerably dumb, only knowing how to swim and seek out pulses of electricity. When battling, if it's fully charged, it will tear it's opponents apart in a blind fury."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sphyrnizor");

    }


}
