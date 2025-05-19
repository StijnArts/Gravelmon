package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Smould extends drai.dev.data.pokemon.Pokemon {
    public Smould() {
        super("Smould",
                Type.GRASS, Type.PSYCHIC,
                new Stats(76,
                        54,
                        76,
                        100,
                        80,
                        50),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                21, 180,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                196, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Smould are the 'Sages of The Forest Floor'; being able to feel the energy flowing in the ground. Their psychic powers can move humans without hassle."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Smould");

    }


}
