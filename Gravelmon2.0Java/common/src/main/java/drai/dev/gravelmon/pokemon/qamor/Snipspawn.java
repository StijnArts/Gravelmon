package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Snipspawn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snipspawn() {
        super("Snipspawn",
                Type.DRAGON,
                new Stats(46,
                        83,
                        20,
                        45,
                        60,
                        88),
                List.of(Ability.CORROSION), Ability.STRONG_JAW,
                3, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Locals say that Snipspawn literally tastes like vomit however you try preparing it, as a result they have very little predators and are usually avoided by fishermen."),
                List.of(new EvolutionEntry("bogbile", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(              new MoveLearnSetEntry(Move.BITE, 1),
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
                        new MoveLearnSetEntry(Move.HEAD_SMASH, 70)          ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 34, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
