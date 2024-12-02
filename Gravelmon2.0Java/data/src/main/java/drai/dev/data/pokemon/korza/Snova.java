package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snova extends drai.dev.data.pokemon.Pokemon {
    public Snova() {
        super("Snova",
                Type.ICE,Type.BUG,
                new Stats(30,
                        45,
                        30,
                        50,
                        40,
                        55),
                List.of(Ability.NO_GUARD), Ability.SNOW_CLOAK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Snova hide under snowpils and eat the grass beneath. Handling their fine silk for too long causes frostbite."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snova");

    }


}
