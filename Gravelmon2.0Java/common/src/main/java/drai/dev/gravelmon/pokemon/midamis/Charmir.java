package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Charmir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Charmir() {
        super("Charmir",
                Type.GRASS,Type.ROCK,
                new Stats(65,
                        70,
                        85,
                        55,
                        45,
                        25),
                List.of(Ability.IRON_BARBS), Ability.STALL,
                5, 165,
                new Stats(0,0,0,0,0,0), 90,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("sambranaust", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(          new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,8),
                        new MoveLearnSetEntry(Move.INGRAIN,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,16),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.AMNESIA,28),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.SPIT_UP,41),
                        new MoveLearnSetEntry(Move.STOCKPILE,41),
                        new MoveLearnSetEntry(Move.SWALLOW,41),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,44)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 33, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Charmir");

    }


}
