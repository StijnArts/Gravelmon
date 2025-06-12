package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Collectrap extends drai.dev.data.pokemon.Pokemon {
    public Collectrap(Stats stats) {
        super("Collectrap",
                Type.ROCK,Type.DARK,
                stats,
                List.of(Ability.STURDY), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Rapnagon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"smotrap"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"needatrap"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"mintrap")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .setSpawnPreset(SpawnPreset.NETHER_FORTRESS)
    .build(), List.of());
	
           setLangFileName("Collectrap");

    }


}
