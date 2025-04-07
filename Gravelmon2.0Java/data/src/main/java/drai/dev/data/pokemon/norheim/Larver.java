package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Larver extends drai.dev.data.pokemon.Pokemon {
    public Larver() {
        super("Larver",
                Type.BUG,
                new Stats(60,
                        35,
                        35,
                        15,
                        35,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 165,
                new Stats(0,0,0,0,0,0), 244,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("strikoon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.COUNTER,1)),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(      new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,9)
                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());

    }


}
