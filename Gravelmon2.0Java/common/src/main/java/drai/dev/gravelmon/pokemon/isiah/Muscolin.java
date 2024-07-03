package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Muscolin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Muscolin() {
        super("Muscolin",
                Type.FIGHTING,
                new Stats(60,
                        90,
                        75,
                        20,
                        20,
                        15),
                List.of(Ability.VITAL_SPIRIT), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                1.0,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("- Pound Normal 5 Focus Energy Normal 8 Harden Normal 12 Karate ChopSTAB Fighting 15 Comet Punch Normal 18 Seismic TossSTAB Fighting 23 Endure Normal 27 Mega Punch Normal 30 Vital ThrowSTAB Fighting 34 Bulk Up Fighting 38 SubmissionSTAB Fighting 43 Captivate Normal 47 Hammer ArmSTAB Fighting 52 ReversalSTAB Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,5),
                        new MoveLearnSetEntry(Move.HARDEN,8),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,12),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,15),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,18),
                        new MoveLearnSetEntry(Move.ENDURE,23),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,27),
                        new MoveLearnSetEntry(Move.VITAL_THROW,30),
                        new MoveLearnSetEntry(Move.BULK_UP,34),
                        new MoveLearnSetEntry(Move.SUBMISSION,38),
                        new MoveLearnSetEntry(Move.CAPTIVATE,43),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,47),
                        new MoveLearnSetEntry(Move.REVERSAL,52),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.VISE_GRIP,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Muscolin");

    }


}
