package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Reefermal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reefermal() {
        super("Reefermal",
                Type.WATER,Type.FIRE,
                new Stats(60,
                        50,
                        80,
                        100,
                        60,
                        70),
                List.of(Ability.WATER_ABSORB), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Reefermal can be found near hydrothermal vents in the ocean. Their bodies are able to withstand the intense heat of the water around the vents. Their fiery fins will sear anything it touches."),
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
           setLangFileName("Reefermal");

    }


}
