package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Thornydid extends drai.dev.data.pokemon.Pokemon {
    public Thornydid(Stats stats) {
        super("Thornydid",
                Type.BUG, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The sweet-smelling essence of its flower can be made into a perfume. Trying to take it by force will get you stabbed by its spines."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BIRCH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Thornydid");

    }


}
