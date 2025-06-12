package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Royalarva extends Pokemon {
    public Royalarva() {
        super("Royalarva",
                Type.BUG,
                new Stats(30,
                        20,
                        20,
                        45,
                        45,
                        35),
                List.of(Ability.SHIELD_DUST), Ability.RUN_AWAY,
                5, 33,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is said that Royalarva look perpetually sad because they are ashamed of their ugliness."),
                List.of(new EvolutionEntry("superbpa", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.BIDE, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"7")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,11),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 10, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
