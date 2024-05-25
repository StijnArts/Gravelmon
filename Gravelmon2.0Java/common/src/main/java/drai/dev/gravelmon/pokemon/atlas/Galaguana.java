package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Galaguana extends drai.dev.gravelmon.pokemon.Pokemon {
    public Galaguana() {
        super("Galaguana",
                Type.WATER,
                new Stats(56,
                        64,
                        71,
                        54,
                        48,
                        62),
                List.of(Ability.ROCK_HEAD), Ability.ROUGH_SKIN,
                4, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Galaguana reside on the soft, sandy shores of a single small island. They swim out into calm waters to relax and eat seaweed. They constantly lick their lips to keep them moist, which has resulted in some companies using their saliva in lip stick."),
                List.of(new EvolutionEntry("reparine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.AQUA_RING,1),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.AQUASLAP,6),
                        new MoveLearnSetEntry(Move.AQUA_RING,11),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,21),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,27),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,32),
                        new MoveLearnSetEntry(Move.LIQUIDATION,37),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,43),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,50),
                        new MoveLearnSetEntry(Move.CRUNCH,54),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,61),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 33, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ISLAND, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Galaguana");

    }


}
