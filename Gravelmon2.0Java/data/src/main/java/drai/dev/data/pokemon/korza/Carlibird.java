package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carlibird extends drai.dev.data.pokemon.Pokemon {
    public Carlibird() {
        super("Carlibird",
                Type.STEEL,Type.BUG,
                new Stats(60,
                        60,
                        60,
                        60,
                        60,
                        80),
                List.of(Ability.RUN_AWAY), Ability.MOTOR_DRIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The holes in Carlibird's elytra reveal glass-like wings underneath. Carlibird enthusiasts give their mons paint-jobs to stand out and have extra personality."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carlibird");

    }


}
