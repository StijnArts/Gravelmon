package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Delugar extends Pokemon {
    public Delugar() {
        super("Delugar",
                Type.WATER, Type.ROCK,
                new Stats(100,75,105,95,125,80),
                List.of(Ability.FUR_COAT, Ability.RAIN_DISH), Ability.BERSERK,
                17, 69,
                new Stats(0,0,3,0,0,0), 45,
                0.875,
                264, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Delugar stay as a pack protecting baby Dampurr during the harsh weather when they can't survive for themselves yet."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 7),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 10),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 16),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 20),
                        new MoveLearnSetEntry(Move.SCREECH, 21),
                        new MoveLearnSetEntry(Move.POISON_GAS, 25),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 27),
                        new MoveLearnSetEntry(Move.SAND_WAVE, 29),
                        new MoveLearnSetEntry(Move.AQUA_RING, 32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 34),
                        new MoveLearnSetEntry(Move.SCALD, 35),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 40),
                        new MoveLearnSetEntry(Move.POWER_GEM, 44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 50),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 55),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION, 63),

                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "egg")
                ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 61, 2.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
    }
}
