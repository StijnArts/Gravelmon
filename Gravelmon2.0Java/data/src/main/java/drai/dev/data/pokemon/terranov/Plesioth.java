package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plesioth extends drai.dev.data.pokemon.Pokemon {
    public Plesioth(Stats stats) {
        super("Plesioth",
                Type.WATER,
                stats,
                List.of(Ability.LONG_REACH), Ability.LONG_REACH,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Giant piscine wyverns with swift and varied underwater movements, as well as deadly breath and charging attacks. Plesioth are agitated by loud noises, so approach warily. Their favorite food is frogs."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Plesioth");

    }


}
