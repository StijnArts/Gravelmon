package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bidengel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bidengel() {
        super("Bidengel",
                Type.GHOST,Type.FAIRY,
                new Stats(75,
                        60,
                        70,
                        100,
                        65,
                        90),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of("Angelic in appearance, Bidengel are shy and caring Pokemon. The size of their disk on top of their halo represents the wisdom of the Bidengel, usually increasing with age. Bidengel don't often come down from the clouds and it is said that because they don't breathe, they can fly all the way to space."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.CONFIDE,4),
                        new MoveLearnSetEntry(Move.SAFEGUARD,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,23),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,28),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,45),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,49),
                        new MoveLearnSetEntry(Move.GUST,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bidengel");

    }


}
