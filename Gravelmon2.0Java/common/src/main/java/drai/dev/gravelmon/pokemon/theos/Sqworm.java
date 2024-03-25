package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sqworm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sqworm() {
        super("Sqworm",
                Type.BUG,Type.GROUND,
                new Stats(40,
                        50,
                        40,
                        30,
                        40,
                        50),
                List.of(Ability.EARTH_EATER), Ability.REGENERATOR,
                3, 10,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gardener's love Sqworm for their ability to turn the soil, keeping it fresh and moist. The length of a Sqworm depends on the quality of soil they've been eating."),
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
           setLangFileName("Sqworm");

    }


}
