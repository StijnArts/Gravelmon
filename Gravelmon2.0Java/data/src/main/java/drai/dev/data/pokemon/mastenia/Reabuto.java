package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Reabuto extends drai.dev.data.pokemon.Pokemon {
    public Reabuto(Stats stats) {
        super("Reabuto",
                Type.DARK, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Not much is known about Reabuto. But it is said to have hunted down larger prey than itself; and might have been the cause of the extinction of a certain fossil Pokémon."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_DEEP_OCEAN).atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
           setLangFileName("Reabuto");
           setCanBreathUnderwater(true);
    }


}
