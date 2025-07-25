package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grebloo extends drai.dev.data.pokemon.Pokemon {
    public Grebloo(Stats stats) {
        super("Grebloo",
                Type.ICE,
                stats,
                List.of(Ability.CLOUD_NINE), Ability.REFRIGERATE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).setAntiBiomes(Biome.IS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Grebloo");

    }


}
