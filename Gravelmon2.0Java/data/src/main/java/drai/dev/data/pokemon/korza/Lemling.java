package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lemling extends drai.dev.data.pokemon.Pokemon {
    public Lemling() {
        super("Lemling",
                Type.WATER,
                new Stats(63,
                        33,
                        40,
                        31,
                        38,
                        53),
                List.of(Ability.FLUFFY,Ability.OBLIVIOUS), Ability.SIMPLE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lemling's fur is fluffy and holds a lot of air, helping it to swim and float. When communities become too dense, they will split and travel downstream."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lemling");

    }


}
