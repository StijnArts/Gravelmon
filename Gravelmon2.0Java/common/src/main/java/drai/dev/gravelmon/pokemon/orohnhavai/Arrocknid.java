package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Arrocknid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Arrocknid() {
        super("Arrocknid",
                Type.ROCK, Type.BUG,
                new Stats(30,
                        75,
                        60,
                        40,
                        65,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                72, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They make their homes in the holes they drill into the cave walls. Since they dwell deep in caves where there is no light, their eyes have adapted very well to allow them to see any movement in the dark. The silently crawl to the roof of the cave to drill out rocks to drop onto its prey."),
                List.of(new EvolutionEntry("exoroknid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,6),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,17),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,22),
                        new MoveLearnSetEntry(Move.BUG_BITE,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,30),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,34),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,36),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,41),
                        new MoveLearnSetEntry(Move.STONE_EDGE,45),
                        new MoveLearnSetEntry(Move.UTURN,50),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,54),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.HEMODRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.TOMBSTONER,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 37, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arrocknid");

    }


}
