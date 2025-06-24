package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tinsugi extends drai.dev.data.pokemon.Pokemon {
    public Tinsugi(Stats stats) {
        super("Tinsugi",
                Type.STEEL,Type.ELECTRIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tinsugi");

    }


}
