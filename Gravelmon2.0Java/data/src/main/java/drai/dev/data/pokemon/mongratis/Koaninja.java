package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koaninja extends drai.dev.data.pokemon.Pokemon {
    public Koaninja(Stats stats) {
        super("Koaninja",
                Type.GRASS, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, front sprite, and type by Feyrah on DeviantArt. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                .setMinLevel(28).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SAVANNA).canSeeSky().atNight()
                .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.TREE_TOP).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Koaninja");

    }


}
