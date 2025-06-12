package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gundoru extends drai.dev.data.pokemon.Pokemon {
    public Gundoru() {
        super("Gundoru",
                Type.ELECTRIC,Type.GROUND,
                new Stats(73,
                        100,
                        45,
                        65,
                        42,
                        73),
                List.of(Ability.MUNCHMISSILE), Ability.MUNCHMISSILE,
                6, 0,
                new Stats(0,1,0,0,0,0), 150,
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
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gundoru");

    }


}
