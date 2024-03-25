package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rudeworm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rudeworm() {
        super("Rudeworm",
                Type.DRAGON,Type.ROCK,
                new Stats(64,
                        113,
                        112,
                        103,
                        40,
                        68),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 940,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                180, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rudeworm");

    }


}
