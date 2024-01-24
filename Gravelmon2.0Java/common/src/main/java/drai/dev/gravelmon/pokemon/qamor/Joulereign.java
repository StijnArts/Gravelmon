package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Joulereign extends drai.dev.gravelmon.pokemon.Pokemon {
    public Joulereign() {
        super("Joulereign",
                Type.ELECTRIC,Type.DARK,
                new Stats(60,
                        105,
                        52,
                        59,
                        70,
                        144),
                List.of(Ability.DAZZLING), Ability.DAZZLING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Joulereign Move with immense speed that leave a trail of static electricity in its wake. They are characterized by their ebony black, rich fur that they constantly groom and their shimmering diamond-shaped spots throughout its body."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Joulereign");

    }


}
