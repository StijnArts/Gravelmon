package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fondoom extends drai.dev.data.pokemon.Pokemon {
    public Fondoom() {
        super("Fondoom",
                Type.STEEL,Type.FIRE,
                new Stats(80,
                        80,
                        85,
                        50,
                        50,
                        62),
                List.of(Ability.MELTY), Ability.FLARE_BOOST,
                7, 0,
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
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Fondoom");

    }


}
