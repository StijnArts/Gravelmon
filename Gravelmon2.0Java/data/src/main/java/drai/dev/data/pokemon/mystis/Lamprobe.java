package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lamprobe extends drai.dev.data.pokemon.Pokemon {
    public Lamprobe() {
        super("Lamprobe",
                Type.GRASS, Type.PSYCHIC,
                new Stats(140,
                        60,
                        65,
                        115,
                        100,
                        25),
                List.of(Ability.STICKY_HOLD), Ability.GOOEY,
                12, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Wood HammerSTAB Grass"),
                List.of(),
                List.of(
                                               ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lamprobe");

    }


}
