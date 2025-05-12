package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grobolt extends drai.dev.data.pokemon.Pokemon {
    public Grobolt() {
        super("Grobolt",
                Type.GRASS,Type.ELECTRIC,
                new Stats(65,
                        65,
                        123,
                        111,
                        87,
                        54),
                List.of(Ability.SAP_SIPPER,Ability.LEAF_GUARD), Ability.LIGHTNING_ROD,
                16, 0,
                new Stats(0,0,2,0,0,0), 50,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grobolt");

    }


}
