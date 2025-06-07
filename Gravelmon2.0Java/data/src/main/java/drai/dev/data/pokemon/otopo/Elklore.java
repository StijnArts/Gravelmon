package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Elklore extends drai.dev.data.pokemon.Pokemon {
    public Elklore(Stats stats) {
        super("Elklore",
                Type.GRASS, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("An old Pokemon that is seldom seen these days. It can be located in the forest's darkest recesses. The Pokemon leaves a distinctive floral scent trailing behind it, which comes from the vegetation growing from its horns, which changes seasonally. The leader of the herd has the most spectacular horns."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Elklore");

    }


}
