package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Rivird extends Pokemon {
    public Rivird() {
        super( "Rivird",
                Type.WATER, Type.FLYING,
                new Stats(40	,
                        55,
                        30	,
                        60,
                        30,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 46,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.FLYING),
                List.of("It can swim underwater for minutes at a time. However, it can only fly for a few minutes either."),
                List.of(new EvolutionEntry("mingola", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.AQUA_JET,17),
                        new MoveLearnSetEntry(Move.GLIDE,21),
                        new MoveLearnSetEntry(Move.WHIRLWIND,27),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,31),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.DRILL_PECK,41),
                        new MoveLearnSetEntry(Move.ROOST,47),
                        new MoveLearnSetEntry(Move.DRILL_RUN,51),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.ANGRY_SWARM,"egg"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"egg"),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                        new MoveLearnSetEntry(Move.RAID,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SING,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.STARFREEZE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.TWISTER,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.WORK_UP,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 19, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH, Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
        setCanSwim(true);
    }
}
