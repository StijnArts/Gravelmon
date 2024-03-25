package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cheetatic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cheetatic() {
        super("Cheetatic",
                Type.NORMAL,Type.ELECTRIC,
                new Stats(60,
                        100,
                        60,
                        100,
                        60,
                        140),
                List.of(Ability.STATIC,Ability.COMPETITIVE), Ability.MOTOR_DRIVE,
                17, 499,
                new Stats(0,0,0,0,0,2), 45,
                0.25,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Cheetatic has a calm and collected demeanor, but is very competitive. It controls the static electricity in its mane to send off powerful electric shocks in a battle."),
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
           setLangFileName("Cheetatic");

    }


}
