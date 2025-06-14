package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aviatrice extends drai.dev.data.pokemon.Pokemon {
    public Aviatrice(Stats stats) {
        super("Aviatrice",
                Type.FLYING, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It lives in the sky, never setting foot on the ground. By using its balloon to sense atmospheric conditions, it avoids getting caught in bad weather."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Aviatrice");

    }


}
