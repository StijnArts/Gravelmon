package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Troglish extends drai.dev.data.pokemon.Pokemon {
    public Troglish() {
        super("Troglish",
                Type.GHOST,Type.POISON,
                new Stats(35,
                        70,
                        25,
                        80,
                        35,
                        75),
                List.of(Ability.ILLUMINATE), Ability.OWN_TEMPO,
                9, 106,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.WATER_1),
                List.of("Found only in pools inside dark caves. Troglish are near blind, and rely on their other senses. Spelunkers nicknamed them the swimming skeletons because of their bioluminescent patterns."),
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
           setLangFileName("Troglish");

    }


}
