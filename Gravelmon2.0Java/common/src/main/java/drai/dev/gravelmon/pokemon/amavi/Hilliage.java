package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hilliage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hilliage() {
        super("Hilliage",
                Type.GROUND, Type.GRASS,
                new Stats(72,
                        72,
                        75,
                        49,
                        63,
                        79),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("mountiful", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(             new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,9),
                        new MoveLearnSetEntry(Move.LEECH_SEED,14),
                        new MoveLearnSetEntry(Move.DRILL_RUN,19),
                        new MoveLearnSetEntry(Move.WORRY_SEED,25),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,35),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40),
                        new MoveLearnSetEntry(Move.ROTOTILLER,45)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 19, 32, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hilliage");

    }


}
