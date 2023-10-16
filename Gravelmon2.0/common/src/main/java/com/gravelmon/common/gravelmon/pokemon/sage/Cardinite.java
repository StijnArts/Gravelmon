package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cardinite extends Pokemon {
    public Cardinite() {
        super("Cardinite",
                Type.FIRE, Type.FLYING,
                new Stats(40, 80, 40, 70, 40, 90),
                List.of(Ability.EARLY_BIRD, Ability.FLASH_FIRE), Ability.FLAME_BODY,
                3, 15,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                72, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Though it can fly, Cardinite prefers to chase its prey around on foot, where it is more comfortable. It leaves a trail of small, scorched tracks as it runs."),
                List.of(new EvolutionEntry("chardinal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,8),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,13),
                        new MoveLearnSetEntry(Move.TEMPEST,19),
                        new MoveLearnSetEntry(Move.FLAME_BURST,23),
                        new MoveLearnSetEntry(Move.TAILWIND,26),
                        new MoveLearnSetEntry(Move.JET_STRIKE,31),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,37),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,41),
                        new MoveLearnSetEntry(Move.ROOST,44),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,55),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg")
                        ),
                List.of(Label.SAGE),
                4, List.of(
                        new ItemDrop("minecraft:egg",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setCanFly(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
