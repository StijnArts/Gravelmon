package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toilengobble extends drai.dev.data.pokemon.Pokemon {
    public Toilengobble() {
        super("Toilengobble",
                Type.DARK,Type.POISON,
                new Stats(85,
                        70,
                        85,
                        95,
                        75,
                        52),
                List.of(Ability.COVEN), Ability.COVEN,
                14, 0,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Toilengobble");

    }


}
