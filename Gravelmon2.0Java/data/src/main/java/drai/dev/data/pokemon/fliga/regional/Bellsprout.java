package drai.dev.data.pokemon.fliga.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bellsprout extends drai.dev.data.pokemon.Pokemon {
    public Bellsprout(String name, Aspect aspect) {
        super(name, aspect, "Bellsprout",
                Type.GRASS, Type.POISON,
                new Stats(50,
                        75,
                        35,
                        70,
                        30,
                        40),
                List.of(Ability.CHLOROPHYLL), Ability.GLUTTONY,
                7, 40,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bellsprout");

    }


}
