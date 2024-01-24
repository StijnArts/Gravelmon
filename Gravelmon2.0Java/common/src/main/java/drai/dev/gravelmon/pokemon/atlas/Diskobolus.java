package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Diskobolus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diskobolus() {
        super("Diskobolus",
                Type.FIGHTING,
                new Stats(78,
                        105,
                        82,
                        44,
                        59,
                        55),
                List.of(Ability.SHEER_FORCE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 75,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("To improve its disc throwing skills, it carries a larger disc as it grows."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Diskobolus");

    }


}
