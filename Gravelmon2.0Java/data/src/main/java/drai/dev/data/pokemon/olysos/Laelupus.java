package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Laelupus extends drai.dev.data.pokemon.Pokemon {
    public Laelupus() {
        super("Laelupus",
                Type.FIGHTING, Type.DARK,
                new Stats(64,
                        70,
                        40,
                        50,
                        45,
                        81),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 155,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Laelupus");

    }


}
