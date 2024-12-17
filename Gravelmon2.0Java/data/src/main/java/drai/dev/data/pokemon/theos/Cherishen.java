package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cherishen extends drai.dev.data.pokemon.Pokemon {
    public Cherishen() {
        super("Cherishen",
                Type.NORMAL, Type.FLYING,
                new Stats(120,
                        50,
                        70,
                        80,
                        85,
                        75),
                List.of(Ability.IMMUNITY), Ability.NATURAL_CURE,
                11, 200,
                new Stats(2,0,0,0,0,0), 70,
                0.5,
                168, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Cherishen");

    }


}
