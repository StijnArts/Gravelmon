package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Artishock extends drai.dev.data.pokemon.Pokemon {
    public Artishock(Stats stats) {
        super("Artishock",
                Type.POISON,Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Artishock");

    }


}
