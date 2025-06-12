package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larvaorg extends drai.dev.data.pokemon.Pokemon {
    public Larvaorg() {
        super("Larvaorg",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SWARM), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Tanccoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"))),
                        new EvolutionEntry("Jotucoon", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Larvaorg");

    }


}
