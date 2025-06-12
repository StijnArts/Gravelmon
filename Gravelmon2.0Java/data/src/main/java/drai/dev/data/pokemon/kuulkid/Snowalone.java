package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snowalone extends drai.dev.data.pokemon.Pokemon {
    public Snowalone() {
        super("Snowalone",
                Type.ICE,Type.NORMAL,
                new Stats(76,
                        65,
                        72,
                        85,
                        97,
                        50),
                List.of(Ability.MATINGCALL), Ability.MATINGCALL,
                22, 0,
                new Stats(0,0,0,1,1,0), 60,
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
    .setBiomes(Biome.IS_SNOWY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snowalone");

    }


}
