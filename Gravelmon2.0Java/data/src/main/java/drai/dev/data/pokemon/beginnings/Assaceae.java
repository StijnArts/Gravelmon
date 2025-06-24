package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Assaceae extends drai.dev.data.pokemon.Pokemon {
    public Assaceae(Stats stats) {
        super("Assaceae",
                Type.POISON,Type.GHOST,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MUSHROOM, Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Assaceae");

    }


}
