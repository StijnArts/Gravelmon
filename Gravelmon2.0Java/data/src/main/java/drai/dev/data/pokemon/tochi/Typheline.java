package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Typheline extends drai.dev.data.pokemon.Pokemon {
    public Typheline() {
        super("Typheline",
                Type.GRASS,Type.WATER,
                new Stats(80,
                        100,
                        100,
                        80,
                        85,
                        85),
                List.of(Ability.LIMBER), Ability.LIMBER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Typheline spend a majority of their life sleeping in shallow water. They gain energy by burying themselves in the mud of shallow water and have their whiskers photosynthesize energy for them."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Typheline");

    }


}
