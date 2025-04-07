package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Isacoon extends drai.dev.data.pokemon.Pokemon {
    public Isacoon() {
        super("Isacoon",
                Type.BUG,Type.POISON,
                new Stats(45,
                        40,
                        85,
                        24,
                        35,
                        20),
                List.of(Ability.SHIELD_DUST), Ability.LEAF_GUARD,
                4, 50,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Now immobile, Isacoon hides in the trees and gathers energy through the hot summer months. The changing of the leaves triggers its final evolution."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BIDE,10),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Isacoon");

    }


}
