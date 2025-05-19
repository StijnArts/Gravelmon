package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Silkute extends drai.dev.data.pokemon.Pokemon {
    public Silkute() {
        super("Silkute",
                Type.BUG, Type.PSYCHIC,
                new Stats(70,
                        30,
                        70,
                        60,
                        75,
                        30),
                List.of(Ability.SWARM), Ability.FILTER,
                7, 40,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                118, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Silkute");

    }


}
