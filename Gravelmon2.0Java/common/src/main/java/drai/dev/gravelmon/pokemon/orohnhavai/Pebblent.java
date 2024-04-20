package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pebblent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pebblent() {
        super("Pebblent",
                Type.ROCK, Type.GRASS,
                new Stats(80,
                        50,
                        68,
                        50,
                        50,
                        15),
                List.of(Ability.LEAF_GUARD,Ability.ROCK_HEAD,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Many gardeners and plant lovers love to have Pebblent in their gardens and homes. They make great plant buddies as they like to tend other plants."),
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
           setLangFileName("Pebblent");

    }


}
