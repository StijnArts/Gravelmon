package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flixtrix extends drai.dev.data.pokemon.Pokemon {
    public Flixtrix(Stats stats) {
        super("Flixtrix",
                Type.DARK, Type.ELECTRIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, name, type, sprites by Magiscarf on Deviant Art Originally made for Magiscarf's Calta Dex. Evo Line: Complete Submission for: Fakeathon 2020: Day 13 - Madagascar; Based on the aye-aye"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flixtrix");

    }


}
