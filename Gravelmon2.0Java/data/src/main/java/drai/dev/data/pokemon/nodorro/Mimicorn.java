package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mimicorn extends drai.dev.data.pokemon.Pokemon {
    public Mimicorn() {
        super("Mimicorn",
                Type.GRASS,
                new Stats(80,
                        40,
                        70,
                        50,
                        60,
                        50),
                List.of(Ability.HARVEST,Ability.LEAF_GUARD), Ability.NATURAL_CURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Mimicorn's tail has a strong sweet aroma, this attracts bugs to come near it. When a bug is in range it attacks."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mimicorn");

    }


}
