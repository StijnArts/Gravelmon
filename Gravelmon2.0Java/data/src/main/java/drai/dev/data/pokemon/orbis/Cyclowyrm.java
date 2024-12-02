package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cyclowyrm extends drai.dev.data.pokemon.Pokemon {
    public Cyclowyrm() {
        super("Cyclowyrm",
                Type.FLYING, Type.DRAGON,
                new Stats(60,
                        50,
                        50,
                        100,
                        65,
                        95),
                List.of(Ability.AIR_LOCK), Ability.WIND_RIDER,
                23, 150,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cyclowyrm");

    }


}
