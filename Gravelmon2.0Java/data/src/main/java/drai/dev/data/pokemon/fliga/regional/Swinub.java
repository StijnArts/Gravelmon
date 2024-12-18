package drai.dev.data.pokemon.fliga.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Swinub extends drai.dev.data.pokemon.Pokemon {
    public Swinub(String name, Aspect aspect) {
        super(name, aspect, "Swinub",
                Type.ICE, Type.GROUND,
                new Stats(50,
                        50,
                        40,
                        30,
                        30,
                        50),
                List.of(Ability.OBLIVIOUS,Ability.SNOW_CLOAK), Ability.THICK_FAT,
                4, 65,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                50, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Swinub");

    }


}
