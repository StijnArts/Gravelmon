package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grimgrin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimgrin() {
        super("Grimgrin",
                Type.DARK,
                new Stats(42,
                        73,
                        67,
                        60,
                        24,
                        34),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Grimgrin are known for large, unblinking eyes and unsettling smile. They tend to stare down anyone who goes near them, with the same unmoving and unwavering expression."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimgrin");

    }


}
