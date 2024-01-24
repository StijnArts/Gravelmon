package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ampelly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ampelly() {
        super("Ampelly",
                Type.ELECTRIC,
                new Stats(55,
                        45,
                        25,
                        70,
                        55,
                        45),
                List.of(Ability.LEVITATE), Ability.STATIC,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                59, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampelly");

    }


}
