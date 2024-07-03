package drai.dev.gravelmon.pokemon.eternalforest;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Malarva extends Pokemon {
    public Malarva() {
        super("Malarva",
                Type.BUG, Type.POISON,
                new Stats(15,
                        45,
                        20,
                        45,
                        30,
                        45),
                List.of(Ability.RUN_AWAY, Ability.RUN_AWAY), Ability.RUN_AWAY,
                1, 2,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Malarva is a parasite that likes to settle on large Pokemon to feed on their blood. It is said that the first strains of the Pokerus were found on this Pokemon and that it is the cause of its propagation."),
                List.of(new EvolutionEntry("mosdeng", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1)
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 11, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
