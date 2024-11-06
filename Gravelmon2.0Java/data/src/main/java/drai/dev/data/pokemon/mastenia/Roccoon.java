package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roccoon extends drai.dev.data.pokemon.Pokemon {
    public Roccoon() {
        super("Roccoon",
                Type.BUG, Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Roccon are vaguely shaped like chairs- or thrones to be specific. Their insides begins to buzz however when sitting on them, causing the victim to have a horrible seizure."),
                List.of(new EvolutionEntry("Papilitite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 31, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Roccoon");

    }


}
