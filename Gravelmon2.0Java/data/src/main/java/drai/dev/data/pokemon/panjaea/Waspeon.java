package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Waspeon extends drai.dev.data.pokemon.Pokemon {
    public Waspeon() {
        super("Waspeon",
                Type.BUG,
                new Stats(60,
                        110,
                        65,
                        95,
                        65,
                        130),
                List.of(Ability.SHIELD_DUST), Ability.SWARM,
                8, 255,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Waspeon");

    }


}
