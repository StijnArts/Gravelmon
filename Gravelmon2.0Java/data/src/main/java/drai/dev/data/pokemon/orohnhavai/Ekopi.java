package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Ekopi extends drai.dev.data.pokemon.Pokemon {
    public Ekopi() {
        super("Ekopi",
                Type.GRASS,
                new Stats(55,
                        65,
                        45,
                        45,
                        45,
                        55),
                List.of(Ability.OVERGROW), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Ekopi love to climb up trees and eat the leaves that make up most of its diet. They like to craft various objects and weapons with leaves and twigs."),
                List.of(new EvolutionEntry("ekoraft", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.LOW_KICK,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,13),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,19),
                        new MoveLearnSetEntry(Move.FORCE_PALM,23),
                        new MoveLearnSetEntry(Move.BULK_UP,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,34),
                        new MoveLearnSetEntry(Move.BULLET_SEED,37),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,40),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,44),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,47),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ekopi");

    }


}
