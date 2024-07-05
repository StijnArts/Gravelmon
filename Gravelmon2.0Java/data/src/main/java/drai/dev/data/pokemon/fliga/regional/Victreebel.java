package drai.dev.data.pokemon.fliga.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Victreebel extends drai.dev.data.pokemon.Pokemon {
    public Victreebel(String name, Aspect aspect) {
        super(name, aspect, "Victreebel",
                Type.GRASS, Type.POISON,
                new Stats(80,
                        105,
                        65,
                        100,
                        70,
                        70),
                List.of(Ability.CHLOROPHYLL), Ability.GLUTTONY,
                17, 155,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Victreebel");

    }


}
