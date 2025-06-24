package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Planktarges extends drai.dev.data.pokemon.Pokemon {
    public Planktarges(Stats stats) {
        super("Planktarges",
                Type.WATER, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.FOLIAGE).build(),
                List.of());
        setAquatic();
           setLangFileName("Planktarges");

    }


}
