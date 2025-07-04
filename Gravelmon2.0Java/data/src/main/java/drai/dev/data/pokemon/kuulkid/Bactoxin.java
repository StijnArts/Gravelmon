package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bactoxin extends drai.dev.data.pokemon.Pokemon {
    public Bactoxin() {
        super("Bactoxin",
                Type.GROUND,Type.POISON,
                new Stats(62,
                        75,
                        76,
                        100,
                        74,
                        53),
                List.of(Ability.POISON_TOUCH), Ability.DRY_SKIN,
                26, 0,
                new Stats(0,0,0,2,0,0), 50,
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
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bactoxin");

    }


}
