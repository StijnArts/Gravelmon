package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Morturtle extends drai.dev.data.pokemon.Pokemon {
    public Morturtle(Stats stats) {
        super("Morturtle",
                Type.GROUND, Type.ROCK,
                stats,
                List.of(Ability.SAND_STREAM), Ability.SAND_FORCE,
                23, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Morturtle are calm and collected but fearsome in battle. They can projectile massive amounts of sand and rocks from their backs. Their shells are incredibly hard and are decorated with glass-like shards that are forged by leftover sand inside their shells. The shards break often however from their loud shots, leaving splinter around them."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Morturtle");

    }


}
