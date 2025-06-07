package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terratusk extends drai.dev.data.pokemon.Pokemon {
    public Terratusk() {
        super("Terratusk",
                Type.ROCK, Type.NORMAL,
                new Stats(75,
                        115,
                        120,
                        30,
                        70,
                        85),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                18, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.87,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("Evo Double-EdgeSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER_SOUL_SAND, Biome.IS_NETHER_FOREST, Biome.IS_BADLANDS)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Terratusk");

    }


}
