package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nyaga extends Pokemon {
    public Nyaga() {
        super( "Nyaga",
                Type.ICE, Type.ELECTRIC,
                new Stats(64	,71	,60	,45	,55	,90),
                List.of(Ability.RIVALRY), Ability.MOTOR_DRIVE,
                12, 467,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                191, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("byakuga", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.WILD_CHARGE.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTROBASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.MACH_BOLT,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,7),
                        new MoveLearnSetEntry(Move.MACH_BOLT,11),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,14),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,20),
                        new MoveLearnSetEntry(Move.HAIL,24),
                        new MoveLearnSetEntry(Move.SPARK,27),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,30),
                        new MoveLearnSetEntry(Move.FREEZEDRY,34),
                        new MoveLearnSetEntry(Move.SCARY_FACE,39),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,43),
                        new MoveLearnSetEntry(Move.CRYOSHOCK,53),
                        new MoveLearnSetEntry(Move.MIST,61),
                        new MoveLearnSetEntry(Move.STARFREEZE,68),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,"tutor"),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,"tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tutor"),
                        new MoveLearnSetEntry(Move.ENERGIZE,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PICK,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.ASSIST,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.LOCKON,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 54, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
