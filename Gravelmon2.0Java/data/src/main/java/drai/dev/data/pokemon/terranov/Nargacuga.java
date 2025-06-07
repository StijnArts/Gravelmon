package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nargacuga extends drai.dev.data.pokemon.Pokemon {
    public Nargacuga() {
        super("Nargacuga",
                Type.DARK,
                new Stats(75,
                        95,
                        60,
                        70,
                        110,
                        135),
                List.of(Ability.LIMBER), Ability.LIMBER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A uniquely-evolved wyvern that calls the forest its home. It hides itself in the shadows and slyly stalks its prey with terrifying speed and tenacity."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nargacuga");

    }


}
