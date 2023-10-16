package com.gravelmon.common.gravelmon.pokemon.xenoverse;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Donanas extends Pokemon {
    public Donanas() {
        super("Donanas",
                Type.GRASS, Type.STEEL,
                new Stats(65, 65, 105, 40, 85, 120),
                List.of(Ability.SWARM, Ability.BATTLE_ARMOR), Ability.GUTS,
                18, 3280,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                177, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.GRASS, EggGroup.FLYING),
                List.of("This very shy Pokemon rarely counterattacks. When in danger, it withdraws in its shell as hard as steel."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.PECK,4),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,12),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.SPIKES,18),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,21),
                        new MoveLearnSetEntry(Move.ENDEAVOR,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.TROP_KICK,32),
                        new MoveLearnSetEntry(Move.SYNTHESIS,35),
                        new MoveLearnSetEntry(Move.STEEL_WING,38),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,43),
                        new MoveLearnSetEntry(Move.GYRO_BALL,48),
                        new MoveLearnSetEntry(Move.POWER_WHIP,53),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                        new MoveLearnSetEntry(Move.POISON_STING,"egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HAWTHORNS,"tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 54, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
