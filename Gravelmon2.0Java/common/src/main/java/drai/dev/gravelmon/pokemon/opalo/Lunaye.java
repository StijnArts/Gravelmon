package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Lunaye extends Pokemon {
    public Lunaye() {
        super("Lunaye",
                Type.FIRE, Type.FAIRY,
                new Stats(90,70,70,110,110,90),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                18, 199,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                264, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 1),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 13),
                        new MoveLearnSetEntry(Move.INCINERATE, 15),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 23),
                        new MoveLearnSetEntry(Move.ACROBATICS, 27),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 31),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 35),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 38),
                        new MoveLearnSetEntry(Move.MOONBLAST, 42),
                        new MoveLearnSetEntry(Move.CALM_MIND, 48),
                        new MoveLearnSetEntry(Move.WILLOWISP, 62),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 68),
                        new MoveLearnSetEntry(Move.TRICK, "egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, "egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "egg"),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_KISS, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 45, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
