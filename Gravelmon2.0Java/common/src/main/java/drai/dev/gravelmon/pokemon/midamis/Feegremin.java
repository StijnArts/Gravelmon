package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Feegremin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Feegremin() {
        super("Feegremin",
                Type.DARK,Type.WATER,
                new Stats(87,
                        123,
                        102,
                        78,
                        82,
                        63),
                List.of(Ability.HYPER_CUTTER), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Feegremin has a vicious temper that it looses in battle. It gets easily enraged on top of this, especially when it ‘s up against stronger foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,16),
                        new MoveLearnSetEntry(Move.AQUA_JET,20),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,30),
                        new MoveLearnSetEntry(Move.WATER_PULSE,36),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,42),
                        new MoveLearnSetEntry(Move.SKULL_BASH,50),
                        new MoveLearnSetEntry(Move.POWER_TRIP,57),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Feegremin");

    }


}