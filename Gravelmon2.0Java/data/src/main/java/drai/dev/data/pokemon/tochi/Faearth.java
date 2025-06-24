package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Faearth extends drai.dev.data.pokemon.Pokemon {
    public Faearth(Stats stats) {
        super("Faearth",
                Type.FAIRY,Type.GROUND,
                stats,
                List.of(Ability.ARENA_TRAP,Ability.MAGIC_GUARD), Ability.MISTY_SURGE,
                17, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Misty Terrain Fairy - BulldozeSTAB Ground - Earth PowerSTAB Ground - EarthquakeSTAB Ground"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Faearth");

    }


}
