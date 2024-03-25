package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Katorit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Katorit() {
        super("Katorit",
                Type.GRASS,Type.QUESTION_MARK,
                new Stats(92,
                        70,
                        95,
                        100,
                        117,
                        61),
                List.of(Ability.OVERGROW), Ability.SUDDENSEED,
                15, 546,
                new Stats(0,0,0,1,2,0), 45,
                0.875,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("Katorit use their large manes to scare off potential threats. By sticking their heads inside the bush, it appears as if they are big and scary. They're actually quite nice."),
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
           setLangFileName("Katorit");

    }


}
