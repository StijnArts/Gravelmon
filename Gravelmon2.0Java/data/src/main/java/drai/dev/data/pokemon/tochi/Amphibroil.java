package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Amphibroil extends drai.dev.data.pokemon.Pokemon {
    public Amphibroil(Stats stats) {
        super("Amphibroil",
                Type.FIRE,Type.POISON,
                stats,
                List.of(Ability.BLAZE), Ability.BLAZE,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Amphibroil have molten lava covering their backs that their body constantly produce. When they move quickly they will spill a massive amounts of very hot lava, which can be dangerous!"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Amphibroil");

    }


}
