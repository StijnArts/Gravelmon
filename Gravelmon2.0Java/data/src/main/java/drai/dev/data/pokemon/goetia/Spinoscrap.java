package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spinoscrap extends drai.dev.data.pokemon.Pokemon {
    public Spinoscrap(Stats stats) {
        super("Spinoscrap",
                Type.ROCK, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Spinoscrap is a Pokemon that ruled the water the same way Tyrantrum ruled the land. It has a cunning, vicious personality and is fond of ambushes."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Spinoscrap");

    }


}
