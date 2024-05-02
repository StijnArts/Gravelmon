package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Weeduza extends drai.dev.gravelmon.pokemon.Pokemon {
    public Weeduza() {
        super("Weeduza",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is very proud of the curly vines that cover its head and it's common to see it wearing different coiffures, though it is unknown how it changes them."),
                List.of(new EvolutionEntry("qamorantangela", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                "\""+ Biome.IS_OCEAN.getId() + ":" + Biome.IS_OCEAN.getName() +"\""))),
                        new EvolutionEntry("hoenniantangela", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                "\""+ Biome.IS_BADLANDS.getId() + ":" + Biome.IS_BADLANDS.getName() +"\""))),
                        new EvolutionEntry("eghotangela", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                "\""+ Biome.IS_END.getId() + ":" + Biome.IS_END.getName() +"\""))),
                        new EvolutionEntry("tangela", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,4),
                        new MoveLearnSetEntry(Move.GROWTH,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.VINE_WHIP,16),
                        new MoveLearnSetEntry(Move.POISON_POWDER,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,24),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,28),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,36),
                        new MoveLearnSetEntry(Move.SLAM,40),
                        new MoveLearnSetEntry(Move.TICKLE,44),
                        new MoveLearnSetEntry(Move.POWER_WHIP,48),
                        new MoveLearnSetEntry(Move.INGRAIN,52),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,56)
                ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 23, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weeduza");

    }


}
