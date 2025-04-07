package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class KushalaDaora extends drai.dev.data.pokemon.Pokemon {
    public KushalaDaora(Stats stats) {
        super("KushalaDaora",
                Type.FLYING, Type.DRAGON,
                stats,
                List.of(Ability.STEELY_SPIRIT), Ability.STEELY_SPIRIT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An Elder Dragon clad in metal plating. Enrobed in gale-strength winds, they whip up storms wherever they go. When enraged, they unleash devastating vortexes that send foes flying. Getting close to one is no mean feat."),
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
           setLangFileName("KushalaDaora");

    }


}
