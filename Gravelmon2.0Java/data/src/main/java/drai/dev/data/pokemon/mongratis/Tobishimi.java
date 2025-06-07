package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tobishimi extends drai.dev.data.pokemon.Pokemon {
    public Tobishimi() {
        super("Tobishimi",
                Type.DRAGON,
                new Stats(140,
                        90,
                        95,
                        90,
                        95,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, sprites, and type by Princess-Phoenix Name assist credit to Tenrio This fakemon originates from Princess-Phoenix's 'Project Freemon' on DeviantArt. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tobishimi");

    }


}
