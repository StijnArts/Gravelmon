package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamothra extends drai.dev.data.pokemon.Pokemon {
    public Flamothra(Stats stats) {
        super("Flamothra",
                Type.BUG, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Etymology It's a play on the words 'Flame' and 'Mothra,' the latter of which is a reference to the giant moth-like creature from the Godzilla franchise"),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(28).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).duringDaytime()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flamothra");

    }


}
