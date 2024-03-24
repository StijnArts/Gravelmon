package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Battlefly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Battlefly() {
        super("Battlefly",
                Type.BUG,Type.FIGHTING,
                new Stats(55,
                        55,
                        65,
                        105,
                        65,
                        90),
                List.of(Ability.COMPOUND_EYES,Ability.INNER_FOCUS,Ability.NO_GUARD), Ability.NO_GUARD,
                15, 165,
                new Stats(0,0,0,2,0,1), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                new MoveLearnSetEntry(Move.LEER,5),
                new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                new MoveLearnSetEntry(Move.PESTER,14),
                new MoveLearnSetEntry(Move.COUNTER,18),
                new MoveLearnSetEntry(Move.PIN_MISSILE,22),
                new MoveLearnSetEntry(Move.SUBMISSION,27),
                new MoveLearnSetEntry(Move.BUG_BUZZ,35),
                new MoveLearnSetEntry(Move.CROSS_CHOP,41),
                new MoveLearnSetEntry(Move.DETECT,48),
                new MoveLearnSetEntry(Move.SUPERPOWER,52),
                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.RETURN,"tm"),
                new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                new MoveLearnSetEntry(Move.ROUND,"tm"),
                new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                new MoveLearnSetEntry(Move.TAUNT,"tm"),
                new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                new MoveLearnSetEntry(Move.WORK_UP,"tm")  ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 41, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
