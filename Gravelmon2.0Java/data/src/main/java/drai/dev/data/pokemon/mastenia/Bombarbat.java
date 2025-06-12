package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bombarbat extends drai.dev.data.pokemon.Pokemon {
    public Bombarbat(Stats stats) {
        super("Bombarbat",
                Type.NORMAL, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bombarbat");

    }


}
