package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Raspberrel extends drai.dev.data.pokemon.Pokemon {
    public Raspberrel(Stats stats) {
        super("Raspberrel",
                Type.NORMAL,Type.GRASS,
                stats,
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                12, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Swallow Normal - Spit UpSTAB Normal"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_BERRY_BUSH).build(),
                List.of());
           setLangFileName("Raspberrel");

    }


}
