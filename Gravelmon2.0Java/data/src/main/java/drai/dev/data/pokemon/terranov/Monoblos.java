package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monoblos extends drai.dev.data.pokemon.Pokemon {
    public Monoblos() {
        super("Monoblos",
                Type.GROUND,
                new Stats(72,
                        130,
                        65,
                        70,
                        90,
                        128),
                List.of(Ability.SAND_RUSH), Ability.SAND_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Endowed with an impressive cranial horn. They use this large horn in brutal attacks, screeching ear-splitting war cries. Defeating one is considered a truly heroic feat among Hunters."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Monoblos");

    }


}
