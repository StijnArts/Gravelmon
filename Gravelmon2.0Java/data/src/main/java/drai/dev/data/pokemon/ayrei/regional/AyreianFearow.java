package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianFearow extends drai.dev.data.pokemon.Pokemon {
    public AyreianFearow(String name, Aspect aspect) {
        super(name, aspect, "Fearow",
                Type.ICE,Type.DARK,
                new Stats(75,
                        95,
                        100,
                        80,
                        46,
                        51),
                List.of(Ability.AVIAN), null,
                12, 380,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("A curious organ inside its abdomen allows it to mantain very cold temperatures no matter where it lives. When its life would be in peril, it incases itself in ice."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,37),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,27),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,18),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,15),
                        new MoveLearnSetEntry(Move.AVALANCHE,25),
                        new MoveLearnSetEntry(Move.PURSUIT,8),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,33),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,41),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,45),
                        new MoveLearnSetEntry(Move.SHATTERBLADE,49),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,22),
                        new MoveLearnSetEntry(Move.ICE_SHARD,5),
                        new MoveLearnSetEntry(Move.ROOST,30),
                        new MoveLearnSetEntry(Move.FROST_WALKER,11),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,55),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FROST_WALKER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 45, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Fearow");

    }


}
