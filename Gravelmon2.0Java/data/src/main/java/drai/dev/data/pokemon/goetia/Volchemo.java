package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Volchemo extends drai.dev.data.pokemon.Pokemon {
    public Volchemo(Stats stats) {
        super("Volchemo",
                Type.ROCK, Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tublip are often found attached to Volchemo, blooming in order to feed off chemicals in its smoke. In exchange they allow Volchemo access to moves such as Ingrain, Synthesis and Giga Drain."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .setSpawnPreset(SpawnPreset.NEAR_MAGMA)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Volchemo");

    }


}
