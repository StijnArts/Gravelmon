package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tweecle extends drai.dev.data.pokemon.Pokemon {
    public Tweecle() {
        super("Tweecle",
                Type.POISON,Type.FLYING,
                new Stats(55,
                        40,
                        55,
                        60,
                        60,
                        80),
                List.of(Ability.PICKUP,Ability.WEAK_ARMOR), Ability.OVERCOAT,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tweecle gather by heaps of garbage to pick out their favorite pieces of trash. They often have to replace the bag they're wearing, so they'll store stashes of them in their nests."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.SWALLOW,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.THRASH,1),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tweecle");

    }


}
