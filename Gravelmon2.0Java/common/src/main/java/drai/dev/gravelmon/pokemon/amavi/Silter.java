package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Silter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Silter() {
        super("Silter",
                Type.WATER,
                new Stats(30,
                        22,
                        40,
                        33,
                        49,
                        10),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("aquariell", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night"))),
                        new EvolutionEntry("akrilles", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day")))),
                List.of(            new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,18),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,27),
                        new MoveLearnSetEntry(Move.DIVE,30),
                        new MoveLearnSetEntry(Move.CLAMP,33)            ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 2, 21, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setAvoidsLand(true);
        setCanBreathUnderwater(true);

    }


}
