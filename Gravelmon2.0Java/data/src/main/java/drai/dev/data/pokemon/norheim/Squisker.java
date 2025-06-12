package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Squisker extends drai.dev.data.pokemon.Pokemon {
    public Squisker() {
        super("Squisker",
                Type.GROUND, Type.GRASS,
                new Stats(120,
                        120,
                        80,
                        90,
                        100,
                        90),
                List.of(Ability.SKILL_LINK), Ability.SKILL_LINK,
                7, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Squisker delivers messages of genetic code to categorize and file the knowledge of each Pokemon; running up and down a giant tree. The drill like horn on top of its head works as a multi-purpose tool, drilling holes in both trees and the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.GROWTH,9),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,17),
                        new MoveLearnSetEntry(Move.LEECH_SEED,25),
                        new MoveLearnSetEntry(Move.DRILL_RUN,33),
                        new MoveLearnSetEntry(Move.WORRY_SEED,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,47),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,52),
                        new MoveLearnSetEntry(Move.LEAF_STORM,64),
                        new MoveLearnSetEntry(Move.ROTOTILLER,71),
                        new MoveLearnSetEntry(Move.MEGAHORN,81),
                        new MoveLearnSetEntry(Move.HORN_DRILL,97),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .004, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squisker");

    }


}
