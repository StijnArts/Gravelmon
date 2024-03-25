package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Snowze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snowze() {
        super("Snowze",
                Type.ICE,Type.NORMAL,
                new Stats(140,
                        120,
                        80,
                        70,
                        110,
                        30),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                20, 1231,
                new Stats(3,1,0,0,0,0), 45,
                0.875,
                328, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Snowze have very thick fur, so they never truly get cold. They go to desolate snow-covered mountains so they can sleep without being disturbed."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snowze");

    }


}
