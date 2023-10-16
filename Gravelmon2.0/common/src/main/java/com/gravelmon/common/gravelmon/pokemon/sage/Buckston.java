package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Buckston extends Pokemon {
    public Buckston() {
        super("Buckston",
                Type.NORMAL,
                new Stats(90, 100, 80, 60, 80, 80),
                List.of(Ability.RIVALRY, Ability.BRAVE_HEART), Ability.DEFIANT,
                18, 1188,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                221, ExperienceGroup.FAST,
                70,
                48, List.of(EggGroup.FIELD),
                List.of("Proud of their power, Buckston constantly battle to test their strength. It is rumored that their migration herds can be seen from space."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,10),
                        new MoveLearnSetEntry(Move.STOMP,14),
                        new MoveLearnSetEntry(Move.BITE,18),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.WORK_UP,27),
                        new MoveLearnSetEntry(Move.ICE_FANG,31),
                        new MoveLearnSetEntry(Move.JUMP_KICK,36),
                        new MoveLearnSetEntry(Move.BRACE,41),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,47),
                        new MoveLearnSetEntry(Move.STANDOFF,52),
                        new MoveLearnSetEntry(Move.CRUNCH,58),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,63),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg")
                        ),
                List.of(Label.SAGE),
                4, List.of(
                        new ItemDrop("minecraft:leather",50, 1,2),
                        new ItemDrop("minecraft:berries",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 36, 55, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.5,
                List.of());
        this.setHasGenderDifferences(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
