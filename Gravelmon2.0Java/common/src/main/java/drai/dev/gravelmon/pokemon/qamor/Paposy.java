package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Paposy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paposy() {
        super("Paposy",
                Type.GRASS,Type.FLYING,
                new Stats(80,
                        58,
                        52,
                        35,
                        49,
                        40),
                List.of(Ability.NATURAL_CURE), Ability.BIG_PECKS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("Paposy live around shallow and still water of the jungles and rain-forests they call home. They are said to smell very pleasantly, domesticated Paposy also happen to be great helpers in gardens."),
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
           setLangFileName("Paposy");

    }


}
