package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pottergeist extends drai.dev.data.pokemon.Pokemon {
    public Pottergeist() {
        super("Pottergeist",
                Type.GHOST,Type.GROUND,
                new Stats(65,
                        77,
                        96,
                        100,
                        65,
                        82),
                List.of(Ability.FRUGAL), Ability.WEAK_ARMOR,
                13, 0,
                new Stats(0,0,0,2,0,0), 60,
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
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Pottergeist");

    }


}
