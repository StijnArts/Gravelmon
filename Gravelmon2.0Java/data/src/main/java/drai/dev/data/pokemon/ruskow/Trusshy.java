package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trusshy extends drai.dev.data.pokemon.Pokemon {
    public Trusshy() {
        super("Trusshy",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("dayfly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day"))),
                        new EvolutionEntry("duskito", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(10).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
           setLangFileName("Trusshy");

    }


}
