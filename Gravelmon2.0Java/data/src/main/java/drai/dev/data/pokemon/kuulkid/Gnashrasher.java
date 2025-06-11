package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gnashrasher extends drai.dev.data.pokemon.Pokemon {
    public Gnashrasher() {
        super("Gnashrasher",
                Type.DARK,Type.FIRE,
                new Stats(75,
                        105,
                        64,
                        96,
                        59,
                        65),
                List.of(Ability.MOXIE), Ability.FLASH_FIRE,
                12, 0,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The heat that eminates from this pokemon's bright orange markings can be altered, allowing them to burn opponents by ramming into them when competing for mates or provide their young with a warm place to sleep during colder months."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gnashrasher");

    }


}
