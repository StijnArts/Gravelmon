package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Vacule extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vacule() {
        super("Vacule",
                Type.GRASS, Type.DARK,
                new Stats(45,
                        40,
                        55,
                        75,
                        70,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("veefere", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,11),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,17),
                        new MoveLearnSetEntry(Move.INGRAIN,21),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,27),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,31),
                        new MoveLearnSetEntry(Move.SPIT_UP,37),
                        new MoveLearnSetEntry(Move.STOCKPILE,37),
                        new MoveLearnSetEntry(Move.SWALLOW,37),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.SEED_BOMB,47),
                        new MoveLearnSetEntry(Move.POWER_WHIP,50)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 38, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vacule");

    }


}
