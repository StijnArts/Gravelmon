package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Buffofluff extends drai.dev.data.pokemon.Pokemon {
    public Buffofluff() {
        super("Buffofluff",
                Type.NORMAL,
                new Stats(140,
                        130,
                        125,
                        40,
                        60,
                        5),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                27, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Buffofluff");

    }


}
