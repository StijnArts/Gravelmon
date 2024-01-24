package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Jelectric extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jelectric() {
        super("Jelectric",
                Type.ELECTRIC,
                new Stats(90,
                        70,
                        40,
                        125,
                        90,
                        60),
                List.of(Ability.LEVITATE), Ability.STATIC,
                8, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                166, ExperienceGroup.ERRATIC,
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
           setLangFileName("Jelectric");

    }


}
