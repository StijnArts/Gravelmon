package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Krima extends drai.dev.data.pokemon.Pokemon {
    public Krima(Stats stats) {
        super("Krima",
                Type.COSMIC,Type.GROUND,
                stats,
                List.of(Ability.GRASS_PELT,Ability.SHED_SKIN), Ability.NATURAL_CURE,
                17, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(45).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kōri'ma");

    }


}
