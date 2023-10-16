package com.gravelmon.common.gravelmon.pokemon.xenoverse;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Madieval extends Pokemon {
    public Madieval() {
        super("Madieval",
                Type.ROCK, Type.FAIRY,
                new Stats(100, 86, 122, 50, 90, 58),
                List.of(Ability.STURDY, Ability.ROCK_HEAD), Ability.JUSTIFIED,
                20, 1271,
                new Stats(0,0,2,0,0,0), 45,
                -1,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                32, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of("It is said that the mystical energy which fills this Pokemon and makes its stones float around is somehow related to the Moon's influence."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.RETALIATE,30),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,36),
                        new MoveLearnSetEntry(Move.MOONBLAST,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,48),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,54),
                        new MoveLearnSetEntry(Move.KINGS_SHIELD,60),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,68),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 54, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
