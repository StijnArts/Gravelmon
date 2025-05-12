package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Loustache extends drai.dev.data.pokemon.Pokemon {
    public Loustache() {
        super("Loustache",
                Type.BUG, Type.ROCK,
                new Stats(70,
                        85,
                        110,
                        40,
                        80,
                        60),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                9, 260,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                164, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- SteamrollerSTAB Bug - RolloutSTAB Rock"),
                List.of(),
                List.of(                  ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(40)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Loustache");

    }


}
