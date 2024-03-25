package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hazardip extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hazardip() {
        super("Hazardip",
                Type.POISON,Type.BUG,
                new Stats(80,
                        95,
                        70,
                        95,
                        70,
                        75),
                List.of(Ability.COMPOUND_EYES), Ability.CONTAMINATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hazardip");

    }


}
