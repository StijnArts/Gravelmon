package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glacerize extends drai.dev.data.pokemon.Pokemon {
    public Glacerize(Stats stats) {
        super("Glacerize",
                Type.ICE,
                stats,
                List.of(Ability.UNBOUNDICYBODY), null,
                23, 0,
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
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(55)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("vanillish", new EvolutionEntry(getCleanName(), EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:end_crystal"));
           setLangFileName("Glacerize");

    }


}
