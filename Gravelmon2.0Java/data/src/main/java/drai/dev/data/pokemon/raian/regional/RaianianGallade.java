package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianGallade extends drai.dev.data.pokemon.Pokemon {
    public RaianianGallade(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianGallade",
                Type.ELECTRIC,Type.FIGHTING,
                stats,
                List.of(), null,
                17, 0,
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
    .setMinLevel(30)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gallade");
            addAdditionalEvolution("kirlia", new EvolutionEntry("raianiangallade", EvolutionType.ITEM_INTERACT, false, List.of(),
                    List.of(),List.of(),"cobblemon:thunder_stone"));
    }


}
