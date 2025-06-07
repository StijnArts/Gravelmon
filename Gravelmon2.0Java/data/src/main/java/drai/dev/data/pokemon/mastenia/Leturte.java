package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leturte extends drai.dev.data.pokemon.Pokemon {
    public Leturte() {
        super("Leturte",
                Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RATTLED), Ability.SAND_FORCE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Leturte gathers ancient pottery from tombs across Mastenia's remote deserts, using it as protective gear. They wander around anxiously as nomadic foot soldiers in the shifting sands, usually all by themselves."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),
                new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_ARID)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Leturte");

    }


}
