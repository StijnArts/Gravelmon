package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stakean extends drai.dev.data.pokemon.Pokemon {
    public Stakean() {
        super("Stakean",
                Type.GRASS,Type.GROUND,
                new Stats(64,
                        64,
                        92,
                        53,
                        95,
                        53),
                List.of(Ability.LEAF_GUARD), null,
                24, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stakean");

    }


}
