package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Turphoon extends drai.dev.data.pokemon.Pokemon {
    public Turphoon() {
        super("Turphoon",
                Type.WATER,Type.FLYING,
                new Stats(80,
                        80,
                        95,
                        110,
                        85,
                        80),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                16, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- HurricaneSTAB Flying - Thunderbolt Electric"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(31).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).isRaining().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Turphoon");

    }


}
