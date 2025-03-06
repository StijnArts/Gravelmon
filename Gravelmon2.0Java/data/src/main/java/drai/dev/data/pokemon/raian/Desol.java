package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Desol extends drai.dev.data.pokemon.Pokemon {
    public Desol(Stats stats) {
        super("Desol",
                Type.DARK,Type.PSYCHIC,
                stats,
                List.of(Ability.DOOMED,Ability.SUPER_LUCK), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 43, 67, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("absol", new EvolutionEntry("Desol", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.NIGHT_SLASH.getName()),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.PSYCHO_CUT.getName()))));
           setLangFileName("Desol");

    }


}
