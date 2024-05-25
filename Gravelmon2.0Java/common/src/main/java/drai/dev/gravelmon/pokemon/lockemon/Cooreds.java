package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Cooreds extends Pokemon {
    public Cooreds() {
        super("Cooreds",
                Type.BUG, Type.NORMAL,
                new Stats(40,
                        10,
                        50,
                        43,
                        45,
                        25),
                List.of(Ability.SHED_SKIN, Ability.OVERCOAT), Ability.TRUANT,
                7, 99,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                134, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Like its previous evolution, it is pretty immobile. While waiting to evolve again, it practices making noises with its trumpet-like mouth."),
                List.of(new EvolutionEntry("probaska", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 8, 31, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
    }
}
