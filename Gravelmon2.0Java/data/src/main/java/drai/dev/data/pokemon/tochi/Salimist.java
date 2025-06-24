package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Salimist extends drai.dev.data.pokemon.Pokemon {
    public Salimist(Stats stats) {
        super("Salimist",
                Type.GHOST,Type.ICE,
                stats,
                List.of(Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                17, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(29).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
        setCanWalkOnWater(true);
        setCanFly(true);
           setLangFileName("Salimist");

    }


}
