package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moffluffle extends drai.dev.data.pokemon.Pokemon {
    public Moffluffle() {
        super("Moffluffle",
                Type.NORMAL,
                new Stats(70,
                        65,
                        100,
                        70,
                        50,
                        65),
                List.of(Ability.OVERCOAT), Ability.FLUFFY,
                13, 0,
                new Stats(0,0,2,0,0,0), 255,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Moffluffle");

    }


}
