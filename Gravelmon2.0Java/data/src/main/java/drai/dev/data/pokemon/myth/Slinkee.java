package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Slinkee extends Pokemon {
    public Slinkee() {
        super("Slinkee",
                Type.WATER,
                new Stats(45,45,40,70,55,60),
                List.of(Ability.INTIMIDATE), Ability.SPRING_LOADED,
                5, 69,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_1, EggGroup.DRAGON),
                List.of("Slinkee use their long slinky-like tail to strangle their prey, then spray it with their toxic water."),
                List.of(new EvolutionEntry("elinkee", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.AQUA_JET, 7),
                        new MoveLearnSetEntry(Move.BIND, 8),
                        new MoveLearnSetEntry(Move.JET_STRIKE, 10),
                        new MoveLearnSetEntry(Move.GLARE, 12),
                        new MoveLearnSetEntry(Move.HEADBUTT, 14),
                        new MoveLearnSetEntry(Move.CRUNCH, 17),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 21),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 23),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 26),
                        new MoveLearnSetEntry(Move.ICE_FANG, 34),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 52),

                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.OCTAZOOKA, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.SPLASH, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, "egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND, "egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG, "egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
