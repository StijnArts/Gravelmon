package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Slunny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slunny() {
        super("Slunny",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EARLY_BIRD), Ability.COMATOSE,
                4, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They sleep for 18 hours a day, buried in snow. If you wake one up during its slumber, it will go into a violent frenzy."),
                List.of(new EvolutionEntry("lagawake", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(            new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,22),
                        new MoveLearnSetEntry(Move.ICY_WIND,29),
                        new MoveLearnSetEntry(Move.FREEZEDRY,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,43),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,50),
                        new MoveLearnSetEntry(Move.SWAGGER,57),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,64),
                        new MoveLearnSetEntry(Move.SHEER_COLD,71)            ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slunny");

    }


}
