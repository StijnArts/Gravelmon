package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ostoe extends drai.dev.data.pokemon.Pokemon {
    public Ostoe() {
        super("Ostoe",
                Type.NORMAL, Type.FLYING,
                new Stats(45,
                        70,
                        50,
                        35,
                        50,
                        75),
                List.of(Ability.WEAK_ARMOR), Ability.TANGLED_FEET,
                6, 50,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ostoe are quiet clumsy and often fall over due to their large feet. Despite this, they are capable of running a mile in only a few minutes."),
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
           setLangFileName("Ostoe");

    }


}
