package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grizzle extends drai.dev.data.pokemon.Pokemon {
    public Grizzle() {
        super("Grizzle",
                Type.NORMAL, Type.DARK,
                new Stats(85,
                        65,
                        45,
                        25,
                        55,
                        50),
                List.of(Ability.ANGER_POINT), Ability.FUR_COAT,
                12, 385,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Grizzle are quite grumpy. They can be found stomping through the woods destroying small trees and rocks."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grizzle");

    }


}
