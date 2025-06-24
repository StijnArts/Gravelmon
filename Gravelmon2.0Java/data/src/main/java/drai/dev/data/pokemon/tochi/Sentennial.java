package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sentennial extends drai.dev.data.pokemon.Pokemon {
    public Sentennial(Stats stats) {
        super("Sentennial",
                Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                41, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sentennial is an ancient colossus made from gold and marble. It was said to have been made to protect an ancient city but it was too destructive and was broken into 100 pieces that were scattered across the land."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TRAIL_RUINS).build(),
                List.of());
           setLangFileName("Sentennial");

    }


}
