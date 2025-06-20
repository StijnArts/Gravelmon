package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nirvantis extends drai.dev.data.pokemon.Pokemon {
    public Nirvantis(Stats stats) {
        super("Nirvantis",
                Type.BUG, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                27, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A bug pokemon overcame a life of hardship to attain enlightenment and become Nirvantis. As it has transcended mortal suffering, it inspires those who seek spiritual peace. Through its harmony with the flow of life energy, its movements became like a graceful stream."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nirvantis");

    }


}
