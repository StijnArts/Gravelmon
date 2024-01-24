package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranWeezing extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranWeezing() {
        super("Weezing",
                Type.POISON,Type.FIRE,
                new Stats(65,
                        65,
                        80,
                        100,
                        120,
                        60),
                List.of(Ability.LEVITATE), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Weezing formed a symbiotic relationship with deep-sea worm Pokemon that help it filter toxins and hazards out of its bloodstream, as well as offering protection by weaponizing Weezing's toxic clouds in a more efficient manner."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GLARE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weezing");

    }


}
