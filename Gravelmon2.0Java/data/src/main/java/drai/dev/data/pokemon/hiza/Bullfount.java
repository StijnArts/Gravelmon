package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bullfount extends drai.dev.data.pokemon.Pokemon {
    public Bullfount() {
        super("Bullfount",
                Type.WATER, Type.FIGHTING,
                new Stats(65,
                        80,
                        65,
                        54,
                        85,
                        56),
                List.of(Ability.TORRENT), Ability.ROCK_HEAD,
                14, 165,
                new Stats(0,0,0,0,2,0), 45,
                0.75,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("With horns and muscles developed to defend against predators, they spend most of their time near water banks with no fear."),
                List.of(new EvolutionEntry("hydrotaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,16),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,19),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,27),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,30),
                        new MoveLearnSetEntry(Move.SUBMISSION,33),
                        new MoveLearnSetEntry(Move.IRON_HEAD,36),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,40),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,44),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,50),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,61),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE,  16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bullfount");

    }


}
