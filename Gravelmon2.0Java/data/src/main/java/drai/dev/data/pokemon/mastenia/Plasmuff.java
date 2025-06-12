package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plasmuff extends drai.dev.data.pokemon.Pokemon {
    public Plasmuff() {
        super("Plasmuff",
                Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.SOUNDPROOF,
                3, 0,
                new Stats(0,0,0,0,0,0), 240,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Plasmuff are tiny bits of floating ectoplasm of sorts -illuminating orbs that are often caught on cameras. Their earmuffs are used to secure their hearing from the loud noises from their evolutions."),
                List.of(new EvolutionEntry("phanpunk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_TAIGA)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Plasmuff");

    }


}
