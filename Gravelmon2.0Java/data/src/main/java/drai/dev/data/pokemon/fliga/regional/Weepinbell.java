package drai.dev.data.pokemon.fliga.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Weepinbell extends drai.dev.data.pokemon.Pokemon {
    public Weepinbell(String name, Aspect aspect) {
        super(name, aspect, "Weepinbell",
                Type.GRASS, Type.POISON,
                new Stats(65,
                        90,
                        50,
                        85,
                        45,
                        55),
                List.of(Ability.CHLOROPHYLL), Ability.GLUTTONY,
                10, 64,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Weepinbell");

    }


}
