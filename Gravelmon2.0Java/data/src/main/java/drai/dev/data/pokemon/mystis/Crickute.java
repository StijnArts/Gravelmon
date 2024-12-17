package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crickute extends drai.dev.data.pokemon.Pokemon {
    public Crickute() {
        super("Crickute",
                Type.BUG, Type.ROCK,
                new Stats(50,
                        50,
                        90,
                        30,
                        90,
                        30),
                List.of(Ability.IRON_BARBS), Ability.FRACTURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                68, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crickute");

    }


}
