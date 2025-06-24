package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orderion extends drai.dev.data.pokemon.Pokemon {
    public Orderion(Stats stats) {
        super("Orderion",
                Type.DRAGON, Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                36, 0,
                new Stats(0,0,0,0,0,0), 5,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Orderion");

    }


}
