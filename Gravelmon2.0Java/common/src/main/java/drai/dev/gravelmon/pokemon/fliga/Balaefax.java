package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Balaefax extends drai.dev.gravelmon.pokemon.Pokemon {
    public Balaefax() {
        super("Balaefax",
                Type.ROCK, Type.FIGHTING,
                new Stats(70,
                        100,
                        80,
                        70,
                        65,
                        90),
                List.of(Ability.STAKEOUT), Ability.SCRAPPY,
                19, 667,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                155, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("Balaefax are downright cruel in their parentage, favoring their strongest chicks while leaving the others to starve. Once fully grown, Balaefax are capable of destroying solid brick walls with their kicks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.MEGA_KICK,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,13),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,22),
                        new MoveLearnSetEntry(Move.JUMP_KICK,26),
                        new MoveLearnSetEntry(Move.STONE_AXE,36),
                        new MoveLearnSetEntry(Move.ROOST,43),
                        new MoveLearnSetEntry(Move.ENDURE,50),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,56),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,61),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,65),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.RUSHDOWN,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 24, 43, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Balaefax");

    }


}
