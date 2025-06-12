package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burroworm extends drai.dev.data.pokemon.Pokemon {
    public Burroworm(Stats stats) {
        super("Burroworm",
                Type.BUG, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The soil it carries around varies based on where it was born. It spins to confuse predators while escaping underground."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Burroworm");

    }


}
