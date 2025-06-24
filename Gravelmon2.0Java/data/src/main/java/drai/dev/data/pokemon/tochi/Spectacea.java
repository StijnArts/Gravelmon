package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spectacea extends drai.dev.data.pokemon.Pokemon {
    public Spectacea(Stats stats) {
        super("Spectacea",
                Type.GHOST,Type.WATER,
                stats,
                List.of(Ability.CURSED_BODY), Ability.PRESSURE,
                34, 0,
                new Stats(0,0,0,0,0,0), 70,
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
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_DEEP_OCEAN).canSeeSky().belowY(30)
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Spectacea");

    }


}
