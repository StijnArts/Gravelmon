package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Firomenis extends drai.dev.data.pokemon.Pokemon {
    public Firomenis() {
        super("Firomenis",
                Type.DRAGON, Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                18, 69,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These mons are large and tough from the many years spent as a Merlicun. Their jaws can crush through trees and bones, and their flight is strong enough to carry people. There are very few Firomenis in the world because most wild Merlicun don't live long enough to evolve, but that is a good thing because their voracious appetites can quickly deplete the vegetation around them."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Firomenis");

    }


}
