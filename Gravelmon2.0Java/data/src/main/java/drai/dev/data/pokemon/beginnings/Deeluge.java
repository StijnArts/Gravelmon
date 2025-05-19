package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deeluge extends drai.dev.data.pokemon.Pokemon {
    public Deeluge() {
        super("Deeluge",
                Type.WATER,
                new Stats(85,
                        50,
                        60,
                        70,
                        95,
                        55),
                List.of(Ability.TORRENT), Ability.STORM_DRAIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite evolving once, Deeluge still can't swim well. It's tube-like tail helps it keep afloat in waters."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Deeluge");

    }


}
