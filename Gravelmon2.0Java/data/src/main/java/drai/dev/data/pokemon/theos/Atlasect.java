package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Atlasect extends drai.dev.data.pokemon.Pokemon {
    public Atlasect() {
        super("Atlasect",
                Type.ROCK, Type.BUG,
                new Stats(75,
                        115,
                        100,
                        50,
                        85,
                        45),
                List.of(Ability.NO_GUARD), Ability.STALWART,
                10, 64,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Similar to Skeetle, Atlasect are constantly increasing the weight and size of their rock. The larger the rock, the better the chance of them attracting a mate."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Atlasect");

    }


}
