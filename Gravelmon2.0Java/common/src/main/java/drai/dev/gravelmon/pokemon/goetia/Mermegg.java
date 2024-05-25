package drai.dev.gravelmon.pokemon.goetia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mermegg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mermegg() {
        super("Mermegg",
                Type.WATER, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WONDER_SKIN,Ability.HYDRATION), Ability.SHELL_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In the summer, many will gather on the beach to create rainbows with the lustrous nacre of their shells. If you witness this, you are sure to have good luck."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mermegg");

    }


}
