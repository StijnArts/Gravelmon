package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terradra extends drai.dev.data.pokemon.Pokemon {
    public Terradra(Stats stats) {
        super("Terradra",
                Type.GRASS, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.GRASS),
                List.of("Dragons Blood Tree"),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(38).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Terradra");

    }


}
