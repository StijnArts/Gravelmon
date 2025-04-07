package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Inferpillar extends drai.dev.data.pokemon.Pokemon {
    public Inferpillar() {
        super("Inferpillar",
                Type.BUG, Type.FIRE,
                new Stats(70,
                        35,
                        45,
                        95,
                        90,
                        73),
                List.of(Ability.SHIELD_DUST), Ability.FLAME_BODY,
                2, 240,
                new Stats(0,0,0,2,1,0), 250,
                0.5,
                187, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Once a year there is a hatcling ceremony of their kind, where forests are covered with red silk, where many eggs are hidden, waiting to hatch."),
                List.of(new EvolutionEntry("flamupet", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"13")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).duringDaytime()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Inferpillar");

    }


}
