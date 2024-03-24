package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Expertri extends drai.dev.gravelmon.pokemon.Pokemon {
    public Expertri() {
        super("Expertri",
                Type.GRASS,Type.FIGHTING,
                new Stats(85,
                        120,
                        90,
                        80,
                        80,
                        80),
                List.of(Ability.OVERGROW), Ability.TECHNICIAN,
                15, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Expertri have mastered every form of tool making. For centuries, it has taught people how to craft all kinds of tools and weapons. It is said that a single Expertri is responsible for the protection of a whole forest."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.LOW_KICK,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,13),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,20),
                        new MoveLearnSetEntry(Move.FORCE_PALM,24),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,32),
                        new MoveLearnSetEntry(Move.LEECH_SEED,33),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,39),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,45),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,50),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,55),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,61),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,66),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE,  36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Expertri");

    }


}
