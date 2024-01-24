package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Soakcuff extends Pokemon {
    public Soakcuff() {
        super("Soakcuff",
                Type.WATER, Type.ROCK,
                new Stats(90,65,105,75,85,60),
                List.of(Ability.FUR_COAT, Ability.RAIN_DISH), Ability.BERSERK,
                11, 69,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Soakcuff shoot spouts of water out of their tail that make a very loud noiseto scare off any near enemies."),
                List.of(new EvolutionEntry("delugar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
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

                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 48, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
