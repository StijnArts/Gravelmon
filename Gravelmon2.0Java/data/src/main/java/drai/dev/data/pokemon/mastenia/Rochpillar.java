package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rochpillar extends drai.dev.data.pokemon.Pokemon {
    public Rochpillar() {
        super("Rochpillar",
                Type.BUG, Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("roccoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 16, 4.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Rochpillar");

    }


}
