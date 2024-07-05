package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Shaboon extends Pokemon {
    public Shaboon() {
        super("Shaboon",
                Type.FIRE, Type.FAIRY,
                new Stats(80,60,55,80,95,70),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                11, 199,
                new Stats(0,0,0,1,1,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("lunaye", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.TAUNT, 9),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 13),
                        new MoveLearnSetEntry(Move.INCINERATE, 17),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 23),
                        new MoveLearnSetEntry(Move.ACROBATICS, 27),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 31),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 35),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 38),
                        new MoveLearnSetEntry(Move.MOONBLAST, 42),
                        new MoveLearnSetEntry(Move.CALM_MIND, 47),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, 53),
                        new MoveLearnSetEntry(Move.WILLOWISP, 58),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
