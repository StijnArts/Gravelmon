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
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- HurricaneSTAB Flying - Thunderbolt Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Turphoon");

    }


}
