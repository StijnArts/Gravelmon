package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gigginox extends drai.dev.data.pokemon.Pokemon {
    public Gigginox() {
        super("Gigginox",
                Type.POISON, Type.DARK,
                new Stats(60,
                        78,
                        75,
                        95,
                        95,
                        87),
                List.of(Ability.MERCILESS), Ability.STAMINA,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A venomous cave dwelling creature that crawls around walls and ceillings, and constantly lays large eggs which hatch multiple offsprings almost instantlly. When enraged Gigginox's skin will harden allowing it to be more reckless."),
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
           setLangFileName("Gigginox");

    }


}
