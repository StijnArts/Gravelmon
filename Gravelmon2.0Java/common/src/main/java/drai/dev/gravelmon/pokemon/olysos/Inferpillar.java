package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Inferpillar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inferpillar() {
        super("Inferpillar",
                Type.BUG,Type.FIRE,
                new Stats(70,
                        35,
                        45,
                        95,
                        90,
                        73),
                List.of(Ability.SHIELD_DUST), Ability.FLAME_BODY,
                2, 240,
                new Stats(0,0,0,2,1,0), 50,
                0.5,
                187, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Once a year there is a hatcling ceremony of their kind, where forests are covered with red silk, where many eggs are hidden, waiting to hatch."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inferpillar");

    }


}
