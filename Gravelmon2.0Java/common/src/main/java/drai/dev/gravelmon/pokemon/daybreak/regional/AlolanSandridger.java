package drai.dev.gravelmon.pokemon.daybreak.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AlolanSandridger extends Pokemon {
    public AlolanSandridger(String name, Aspect aspect) {
        super(name, aspect, "AlolanSandridger",
                Type.ICE, Type.STEEL,
                new Stats(75, 130, 140, 25, 85, 95),
                List.of(Ability.EARTH_EATER), Ability.SLUSH_RUSH,
                15, 555,
                new Stats(0,1,2,0,0,0), 90,
                0.875,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It uses its large metal claws to defend against predators and dig large dens in the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GYRO_BALL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.GYRO_BALL,5),
                        new MoveLearnSetEntry(Move.ICE_BALL,7),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,9),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,11),
                        new MoveLearnSetEntry(Move.ICE_SHARD,14),
                        new MoveLearnSetEntry(Move.SWIFT,17),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,20),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.DIG,33),
                        new MoveLearnSetEntry(Move.BULLET_SWING,38),
                        new MoveLearnSetEntry(Move.METAL_CLAW,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,48),
                        new MoveLearnSetEntry(Move.HAIL,50),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,55),
                        new MoveLearnSetEntry(Move.FROST_RUSH,60),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.FROST_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tutor")
                        ),
                List.of(Label.DAYBREAK),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 54, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setPreEvolution("Sandslash");
        setLangFileName("Sandridger");
    }
}
