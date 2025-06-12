package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whirlybug extends drai.dev.data.pokemon.Pokemon {
    public Whirlybug() {
        super("Whirlybug",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoping to take flight, it spins the propeller on its head as hard as it can and jumps. However, it always ends up face down in the mud."),
                List.of(new EvolutionEntry("shellicopter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"))),
                        new EvolutionEntry("aviatrice", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")))),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Whirlybug");

    }


}
