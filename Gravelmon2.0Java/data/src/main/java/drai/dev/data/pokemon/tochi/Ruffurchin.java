package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ruffurchin extends drai.dev.data.pokemon.Pokemon {
    public Ruffurchin(Stats stats) {
        super("Ruffurchin",
                Type.POISON,Type.DARK,
                stats,
                List.of(Ability.PUNK_ROCK), Ability.PUNK_ROCK,
                7, 0,
                new Stats(0,0,0,0,0,0), 85,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Ruffurchin");

    }


}
