package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Troublweed extends drai.dev.data.pokemon.Pokemon {
    public Troublweed(Stats stats) {
        super("Troublweed",
                Type.GROUND, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Troublweed");

    }


}
