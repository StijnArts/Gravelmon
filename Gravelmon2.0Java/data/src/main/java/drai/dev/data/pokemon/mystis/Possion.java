package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Possion extends drai.dev.data.pokemon.Pokemon {
    public Possion() {
        super("Possion",
                Type.POISON,
                new Stats(45,
                        40,
                        50,
                        100,
                        45,
                        40),
                List.of(Ability.POWER_OF_ALCHEMY), Ability.CURIOUS_MEDICINE,
                4, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("bubbeldam", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP)
                        .setSpawnPreset(SpawnPreset.ILLAGER_STRUCTURES ).build(),
                List.of());
           setLangFileName("Possion");

    }


}
