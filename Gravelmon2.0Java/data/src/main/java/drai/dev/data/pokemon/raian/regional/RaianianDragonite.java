package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianDragonite extends drai.dev.data.pokemon.Pokemon {
    public RaianianDragonite(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianDragonite",
                Type.DRAGON,Type.WATER,
                stats,
                List.of(), null,
                27, 0,
                new Stats(0,0,0,0,0,0), 30,
                0,
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
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Dragonite");
            addAdditionalEvolution("dragonair",new EvolutionEntry("raianiandragonite", EvolutionType.LEVEL_UP, List.of(),
                    List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55"),
                            new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"),
                            new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_COLD_OCEAN.getId() + ":" + Biome.IS_COLD_OCEAN.getName()))) );
    }


}
