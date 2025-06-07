package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Taranturem extends drai.dev.data.pokemon.Pokemon {
    public Taranturem() {
        super("Taranturem",
                Type.GHOST, Type.BUG,
                new Stats(130,
                        150,
                        110,
                        90,
                        110,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                306, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("rarspider"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIDER_WEB,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,15),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,40),
                        new MoveLearnSetEntry(Move.GUILLOTINE,70)                        ),
                List.of(Label.RICA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Taranturem");

    }


}
