package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Beelobuzz extends drai.dev.data.pokemon.Pokemon {
    public Beelobuzz(Stats stats) {
        super("Beelobuzz",
                Type.BUG, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An obnoxious pest that relentlessly pursues the smell of blood to feed on. When they begin to swarm, you had better take shelter before you’re covered in itchy bite marks."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Beelobuzz");

    }


}
