package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nergigante extends drai.dev.data.pokemon.Pokemon {
    public Nergigante() {
        super("Nergigante",
                Type.DRAGON, Type.FIGHTING,
                new Stats(90,
                        150,
                        110,
                        55,
                        105,
                        90),
                List.of(Ability.REGENERATOR), Ability.REGENERATOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nergigante prey on other Elder Dragons, mostly weakened, using nothing but its sheer strength. The deadly spikes that cover its body will quickly regenerate if broken or launched during its attacks."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nergigante");

    }


}
