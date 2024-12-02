package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fuzzly extends drai.dev.data.pokemon.Pokemon {
    public Fuzzly() {
        super("Fuzzly",
                Type.NORMAL, Type.BUG,
                new Stats(50,
                        80,
                        60,
                        30,
                        30,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("hivernate", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=female\""))),
                        new EvolutionEntry("grizzlair", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=male\"")))),
                List.of(       new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,5),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,16),
                        new MoveLearnSetEntry(Move.FELL_STINGER,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.SAFEGUARD,27),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,31)                 ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.HONEY_TREE),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
