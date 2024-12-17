package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mantislash extends drai.dev.data.pokemon.Pokemon {
    public Mantislash() {
        super("Mantislash",
                Type.FAIRY, Type.FIGHTING,
                new Stats(65,
                        115,
                        60,
                        60,
                        80,
                        95),
                List.of(Ability.STAKEOUT), Ability.SHARPNESS,
                18, 510,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mantislash overcome stronger opponents through the use of their speed and technical striking, targeting their weak points."),
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
           setLangFileName("Mantislash");

    }


}
