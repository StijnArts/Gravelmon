package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Alatreon extends drai.dev.data.pokemon.Pokemon {
    public Alatreon(Stats stats) {
        super("Alatreon",
                Type.DRAGON,
                stats,
                List.of(Ability.PROTEAN), Ability.PROTEAN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Blazing black dragons, so named for resembling both lightning and darkness. They mercilessly tear apart whoever touches their sharp scales. Elementally unstable, their actions can affect the very weather. Living natural disasters."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Alatreon");

    }


}
