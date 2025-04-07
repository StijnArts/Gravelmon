package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anufelis extends drai.dev.data.pokemon.Pokemon {
    public Anufelis() {
        super("Anufelis",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        140,
                        80,
                        50,
                        120,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 2141,
                new Stats(0,0,0,0,0,0), 3,
                -1,
                220, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Legends speak of Anufelis guiding lost souls to their resting place or even back to life. Trainers brave the treacherous sandstorms of the Infernal Dunes in search of its temple, but few return, and the whereabouts of the Guardian remain a mystery."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).atNight().cantSeeSky()
                        .setSpawnPreset(SpawnPreset.DESERT_PYRAMID).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Anufelis");

    }


}
