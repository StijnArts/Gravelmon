package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Estoe extends Pokemon {
    public Estoe() {
        super("Estoe",
                Type.PSYCHIC, Type.POISON,
                new Stats(91,
                        41,
                        89,
                        71,
                        89,
                        31),
                List.of(Ability.GEIGER_AURA, Ability.LIQUID_OOZE), Ability.AFTERMATH,
                5, 90,
                new Stats(0,0,0,0,1,0), 120,
                -1,
                67, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Some say this Pokemon originated from another plane of existence. Lingering in its presence is considered dangerous due to the strange, cell altering energy it emits."),
                List.of(new EvolutionEntry("perpetua", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.FLATTER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,8),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,24),
                        new MoveLearnSetEntry(Move.POISON_JAB,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,48),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,64),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,72)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
