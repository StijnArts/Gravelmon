package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whaloon extends drai.dev.data.pokemon.Pokemon {
    public Whaloon() {
        super("Whaloon",
                Type.FLYING,
                new Stats(130,
                        30,
                        30,
                        70,
                        65,
                        60),
                List.of(Ability.CLOUD_NINE,Ability.OBLIVIOUS), Ability.WIND_RIDER,
                10, 680,
                new Stats(1,0,0,0,0,0), 130,
                0.5,
                105, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
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
           setLangFileName("Whaloon");

    }


}
