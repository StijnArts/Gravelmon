package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Collecjunk extends drai.dev.data.pokemon.Pokemon {
    public Collecjunk(Stats stats) {
        super("Collecjunk",
                Type.STEEL,Type.POISON,
                stats,
                List.of(Ability.CORROSION), null,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Rexagon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Telvant"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Scrwant"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Bulbant")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Collecjunk");

    }


}
