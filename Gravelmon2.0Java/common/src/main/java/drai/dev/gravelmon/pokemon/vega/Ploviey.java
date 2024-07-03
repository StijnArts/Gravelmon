package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Ploviey extends Pokemon {
    public Ploviey() {
        super( "Ploviey",
                Type.NORMAL, Type.FLYING,
                new Stats(45,
                        30,
                        34,
                        55,
                        41,
                        46),
                List.of(Ability.KEEN_EYE), Ability.BIG_PECKS,
                4, 46,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They move with toddling because they are not good at flying. Its appearance is very cute."),
                List.of(new EvolutionEntry("Hyorhythm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.DEFOG,13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,16),
                        new MoveLearnSetEntry(Move.WHIRLWIND,20),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,28),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,32),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,37),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,40),
                        new MoveLearnSetEntry(Move.HURRICANE,44),
                        new MoveLearnSetEntry(Move.GLIDE,"tutor"),
                        new MoveLearnSetEntry(Move.LEER,"tutor"),
                        new MoveLearnSetEntry(Move.TWISTER,"tutor"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,"tutor"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.GLORY_WING,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.CORNER,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"egg"),
                        new MoveLearnSetEntry(Move.WARBLE,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.PECK,"egg"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.GROWL,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 19, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
    }
}
