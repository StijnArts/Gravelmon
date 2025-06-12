package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Decaith extends drai.dev.data.pokemon.Pokemon {
    public Decaith() {
        super("Decaith",
                Type.GHOST,Type.POISON,
                new Stats(55,
                        58,
                        60,
                        90,
                        90,
                        50),
                List.of(Ability.STENCH), Ability.LEVITATE,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Decaith");

    }


}
