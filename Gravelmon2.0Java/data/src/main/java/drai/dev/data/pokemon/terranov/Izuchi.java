package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Izuchi extends drai.dev.data.pokemon.Pokemon {
    public Izuchi() {
        super("Izuchi",
                Type.STEEL,
                new Stats(45,
                        65,
                        55,
                        30,
                        55,
                        80),
                List.of(Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their sharp tails are used for combat and climbing to reach food. A swipe from their tail is powerful enough to cut through bamboo stalks."),
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
           setLangFileName("Izuchi");

    }


}
