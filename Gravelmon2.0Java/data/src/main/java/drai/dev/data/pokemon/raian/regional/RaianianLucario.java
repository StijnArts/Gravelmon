package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianLucario extends drai.dev.data.pokemon.Pokemon {
    public RaianianLucario(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianLucario",
                Type.FIGHTING,Type.FIRE,
                stats,
                List.of(), null,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
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
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_CRIMSON, Biome.IS_NETHER_WASTELAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lucario");
            addAdditionalEvolution("riolu", new EvolutionEntry("raianianlucario", EvolutionType.LEVEL_UP, List.of(),
                    List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"220"),
                            new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_NETHER.getId() + ":" + Biome.IS_NETHER.getName()))));
    }


}
