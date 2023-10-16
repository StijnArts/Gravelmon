package com.gravelmon.common.gravelmon.pokemon.infinity;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Arbird extends Pokemon {
    public Arbird() {
        super("Arbird",
                Type.STEEL, Type.NORMAL,
                new Stats(47, 56, 95, 18, 52, 52),
                List.of(Ability.KEEN_EYE, Ability.STURDY), Ability.WEAK_ARMOR,
                5, 150,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                80, ExperienceGroup.SLOW,
                70,
                39, List.of(EggGroup.FLYING),
                List.of("Arbird are sent off on their own mere hours after hatching, left to fend for themselves. Their dense armor keeps them safe from potential predators."),
                List.of(new EvolutionEntry("skarmory", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.SWIFT,9),
                        new MoveLearnSetEntry(Move.AGILITY,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,17),
                        new MoveLearnSetEntry(Move.FEINT,20),
                        new MoveLearnSetEntry(Move.STEEL_WING,23),
                        new MoveLearnSetEntry(Move.SPIKES,28),
                        new MoveLearnSetEntry(Move.METAL_SOUND,31),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,34),
                        new MoveLearnSetEntry(Move.IRON_HEAD,39),
                        new MoveLearnSetEntry(Move.FLAIL,45),
                        new MoveLearnSetEntry(Move.SKULL_BASH,52),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 16, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
