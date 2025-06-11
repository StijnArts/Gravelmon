package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianNoctowl extends drai.dev.data.pokemon.Pokemon {
    public RaianianNoctowl(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianNoctowl",
                Type.ROCK,Type.FLYING,
                stats,
                List.of(), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
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
    .setPool(SpawnPool.RARE)
    .setMinLevel(22)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Noctowl");
        addAdditionalEvolution("hoothoot", new EvolutionEntry("raianiannoctowl", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_MOUNTAIN.getId() + ":" + Biome.IS_MOUNTAIN.getName()))));
    }


}
