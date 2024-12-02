package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class GoreMagala extends drai.dev.data.pokemon.Pokemon {
    public GoreMagala(Stats stats) {
        super("GoreMagala",
                Type.DARK, Type.QUESTION_MARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A curious monster that, when threatened, scatters pollen-like scales that heighten its own senses while causing detrimental effects to any other creatures that inhale them. They're feared not only for their sinister appearance but also for the mysterious Frenzy virus they carry."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gore Magala");

    }


}
