package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Duramboros extends drai.dev.data.pokemon.Pokemon {
    public Duramboros() {
        super("Duramboros",
                Type.GRASS, Type.ROCK,
                new Stats(165,
                        85,
                        120,
                        70,
                        90,
                        20),
                List.of(Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Fly Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLY,1)                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Duramboros");

    }


}
