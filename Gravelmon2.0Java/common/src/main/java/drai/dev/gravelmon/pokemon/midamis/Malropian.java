package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Malropian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Malropian() {
        super("Malropian",
                Type.POISON,Type.BUG,
                new Stats(80,
                        60,
                        95,
                        100,
                        75,
                        75),
                List.of(Ability.LIQUID_OOZE), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Malropian's tail cannot sting, rather, it can spray terrible acid that can melt skin. It's large appearance can be quite intimidating, comparable to Drapion."),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Malropian");

    }


}
