package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranKoffing extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranKoffing() {
        super("Koffing",
                Type.POISON,Type.FIRE,
                new Stats(40,
                        35,
                        55,
                        80,
                        95,
                        35),
                List.of(Ability.LEVITATE), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When introduced to Qamor Koffing migrated to deep ocean trenches were they now feast off of hydrothermal vents."),
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
           setLangFileName("Koffing");

    }


}
