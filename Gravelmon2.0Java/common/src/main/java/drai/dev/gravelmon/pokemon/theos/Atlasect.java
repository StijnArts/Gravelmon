package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Atlasect extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atlasect() {
        super("Atlasect",
                Type.ROCK,Type.BUG,
                new Stats(75,
                        115,
                        100,
                        50,
                        85,
                        45),
                List.of(Ability.NO_GUARD), Ability.STALWART,
                10, 64,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Similar to Skeetle, Atlasect are constantly increasing the weight and size of their rock. The larger the rock, the better the chance of them attracting a mate."),
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
           setLangFileName("Atlasect");

    }


}
