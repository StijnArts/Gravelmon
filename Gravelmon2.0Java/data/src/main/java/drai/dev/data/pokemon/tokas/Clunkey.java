package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clunkey extends drai.dev.data.pokemon.Pokemon {
    public Clunkey(Stats stats) {
        super("Clunkey",
                Type.STEEL,
                stats,
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                15, 0,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In the forests, it's said that clunkey have been spotted on the rarest of occasions. Those who've found one have great luck for a year."),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID).build(),
                List.of());
           setLangFileName("Clunkey");

    }


}
