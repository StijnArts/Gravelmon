package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Serpensync extends Pokemon {
    public Serpensync() {
        super("Serpensync",
                Type.WATER, Type.DRAGON,
                new Stats(110,110,70,110,65,70),
                List.of(Ability.INTIMIDATE), Ability.SPRING_LOADED,
                25, 69,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                264, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_1, EggGroup.DRAGON),
                List.of("Serpensync are often mistaken for Rayquaza in the sky due to their long bodies and how fast they dash through the air. They use this speed to catch high flying prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.AQUA_JET, 1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 1),
                        new MoveLearnSetEntry(Move.POISON_FANG, 1),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, 1),
                        new MoveLearnSetEntry(Move.POWER_WHIP, 1),
                        new MoveLearnSetEntry(Move.SUBMISSION, 1),
                        new MoveLearnSetEntry(Move.BIND, 1),
                        new MoveLearnSetEntry(Move.JET_STRIKE, 17),
                        new MoveLearnSetEntry(Move.GLARE, 21),
                        new MoveLearnSetEntry(Move.HEADBUTT, 23),
                        new MoveLearnSetEntry(Move.CRUNCH, 26),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 39),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 42),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 43),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 55),
                        new MoveLearnSetEntry(Move.ICE_FANG, 60),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 60),
                        new MoveLearnSetEntry(Move.OUTRAGE, 62),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 67),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, 70),

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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 67, 1.8, List.of(
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
