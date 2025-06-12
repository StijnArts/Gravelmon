package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lizava extends drai.dev.data.pokemon.Pokemon {
    public Lizava(Stats stats) {
        super("Lizava",
                Type.ROCK, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is known to expel powerful jets of steam and soot from its nostrils after emerging from its home in active volcanoes. Unlike Magmar, a pokemon that shares a similar ecological niche, Lizava is capable of living in colder volcanic regions as well as tropical ones."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lizava");

    }


}
