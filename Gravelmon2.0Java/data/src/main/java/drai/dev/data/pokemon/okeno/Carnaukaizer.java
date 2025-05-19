package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Carnaukaizer extends drai.dev.data.pokemon.Pokemon {
    public Carnaukaizer() {
        super("Carnaukaizer",
                Type.GRASS, Type.ROCK,
                new Stats(124,
                        94,
                        84,
                        74,
                        80,
                        80),
                List.of(Ability.LEAF_GUARD), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bamboo ShotSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Carnaukaizer");

    }


}
