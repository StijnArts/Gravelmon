package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hogrump extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hogrump() {
        super("Hogrump",
                Type.DARK,
                new Stats(60,
                        82,
                        45,
                        45,
                        45,
                        74),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                123, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Now much larger and belligerent in nature, it's impossible for Hogrump to steal fruit without getting caught by farmers. As a result, they bully and steal instead from weaker Yoink."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hogrump");

    }


}
