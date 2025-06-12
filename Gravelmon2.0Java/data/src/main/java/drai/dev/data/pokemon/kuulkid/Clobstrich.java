package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clobstrich extends drai.dev.data.pokemon.Pokemon {
    public Clobstrich() {
        super("Clobstrich",
                Type.ROCK,Type.FLYING,
                new Stats(100,
                        78,
                        75,
                        20,
                        20,
                        95),
                List.of(Ability.ROCK_HEAD), Ability.MOLD_BREAKER,
                16, 0,
                new Stats(0,0,0,0,0,0), 140,
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
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Clobstrich");

    }


}
