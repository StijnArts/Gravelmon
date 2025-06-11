package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianDragoniteOne extends drai.dev.data.pokemon.Pokemon {
    public RaianianDragoniteOne(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianDragoniteOne",
                Type.DRAGON,Type.POISON,
                stats,
                List.of(), null,
                26, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dragonite");
        addAdditionalEvolution("dragonair",new EvolutionEntry("dragonite-raianiantwo", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_COLD_OCEAN.getId() + ":" + Biome.IS_COLD_OCEAN.getName()))) );

    }


}
