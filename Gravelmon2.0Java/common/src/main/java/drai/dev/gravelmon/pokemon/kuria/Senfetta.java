package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Senfetta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Senfetta() {
        super("Senfetta",
                Type.WATER,Type.FAIRY,
                new Stats(92,
                        68,
                        72,
                        116,
                        95,
                        77),
                List.of(Ability.NATURAL_CURE,Ability.HYDRATION), Ability.SERENE_GRACE,
                9, 119,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FAIRY),
                List.of(""),
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
           setLangFileName("Senfetta");

    }


}
