package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Izuchi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Izuchi() {
        super("Izuchi",
                Type.STEEL,
                new Stats(45,
                        65,
                        55,
                        30,
                        55,
                        80),
                List.of(Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their sharp tails are used for combat and climbing to reach food. A swipe from their tail is powerful enough to cut through bamboo stalks."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Izuchi");

    }


}
