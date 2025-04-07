package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squigment extends drai.dev.data.pokemon.Pokemon {
    public Squigment() {
        super("Squigment",
                Type.FIGHTING,Type.NORMAL,
                new Stats(56,
                        64,
                        36,
                        55,
                        32,
                        65),
                List.of(Ability.COMPETITIVE), Ability.COMPETITIVE,
                0, 0,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squigment");

    }


}
