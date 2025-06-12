package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plasmuff extends drai.dev.data.pokemon.Pokemon {
    public Plasmuff() {
        super("Plasmuff",
                Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.SOUNDPROOF,
                3, 0,
                new Stats(0,0,0,0,0,0), 240,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Plasmuff are tiny bits of floating ectoplasm of sorts -illuminating orbs that are often caught on cameras. Their earmuffs are used to secure their hearing from the loud noises from their evolutions."),
                List.of(new EvolutionEntry("phanpunk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 8, 28, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plasmuff");

    }


}
