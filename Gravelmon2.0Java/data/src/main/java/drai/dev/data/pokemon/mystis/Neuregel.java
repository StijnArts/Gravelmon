package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Neuregel extends drai.dev.data.pokemon.Pokemon {
    public Neuregel() {
        super("Neuregel",
                Type.POISON, Type.PSYCHIC,
                new Stats(90,
                        60,
                        80,
                        120,
                        130,
                        100),
                List.of(Ability.NEUROFORCE), Ability.NEUROFORCE,
                23, 0,
                new Stats(0,0,0,0,0,0), 6,
                0.0,
                293, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("With its mind polluted by the corruption, almost all bodies of water near it's resting place have become stagnant. People fear that it may poison the entire water supply of Mystis if left unchecked."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Neuregel");

    }


}
