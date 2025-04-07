package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vivility extends drai.dev.data.pokemon.Pokemon {
    public Vivility() {
        super("Vivility",
                Type.FLYING, Type.GRASS,
                new Stats(110,
                        90,
                        100,
                        90,
                        100,
                        110),
                List.of(Ability.GALE_WINGS), Ability.SERENE_GRACE,
                29, 0,
                new Stats(0,0,0,0,0,0), 20,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is said that there is a sacred tree that blooms once every several thousand years that gives grace and vitality, and that the resulting blooms will soar as soon as it blooms. This bloom in the sky is Vivility, the Bloom of the Wind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SEED_FLARE,1),
                        new MoveLearnSetEntry(Move.FLEUR_CANNON,1),
                        new MoveLearnSetEntry(Move.JUNGLE_HEALING,1),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vivility");

    }


}
