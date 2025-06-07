package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geonigma extends drai.dev.data.pokemon.Pokemon {
    public Geonigma(Stats stats) {
        super("Geonigma",
                Type.NORMAL,
                stats,
                List.of(Ability.ACCLIMATIZE), Ability.ACCLIMATIZE,
                0, 0,
                new Stats(0,0,0,0,0,0), 35,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Geonigma comes from an experiment where Ditto was subjected to the harshest of environments. Its body instead morphed into a black silhouette, allowing it to merge seamlessly into its environment whilst taking on its properties."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Geonigma");

    }


}
