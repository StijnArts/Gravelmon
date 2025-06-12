package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Muscolin extends drai.dev.data.pokemon.Pokemon {
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
                7, 165,
                new Stats(0,1,0,0,0,0), 190,
                1.0,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("- Pound Normal 5 Focus Energy Normal 8 Harden Normal 12 Karate ChopSTAB Fighting 15 Comet Punch Normal 18 Seismic TossSTAB Fighting 23 Endure Normal 27 Mega Punch Normal 30 Vital ThrowSTAB Fighting 34 Bulk Up Fighting 38 SubmissionSTAB Fighting 43 Captivate Normal 47 Hammer ArmSTAB Fighting 52 ReversalSTAB Fighting"),
                List.of(new EvolutionEntry("bosteroid", EvolutionType.TRADE, List.of(),
                        List.of())),
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
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.VISE_GRIP,"tm"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Muscolin");

    }


}
