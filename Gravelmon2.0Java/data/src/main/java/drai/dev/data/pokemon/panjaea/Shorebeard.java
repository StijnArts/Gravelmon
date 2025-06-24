package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shorebeard extends drai.dev.data.pokemon.Pokemon {
    public Shorebeard(Stats stats) {
        super("Shorebeard",
                Type.NORMAL, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COAST).setAntiBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shorebeard");

    }


}
