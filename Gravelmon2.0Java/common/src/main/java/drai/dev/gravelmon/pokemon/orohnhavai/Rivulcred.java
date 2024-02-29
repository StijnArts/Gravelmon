package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rivulcred extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rivulcred() {
        super("Rivulcred",
                Type.WATER,Type.DRAGON,
                new Stats(110,
                        70,
                        80,
                        130,
                        90,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is known to be a guardian to a sacred river in the Orohn Division. It kept the waters clean and pure. When it disappeared the river became polluted which killed all the plants and made the Pokemon sick."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rivulcred");

    }


}
