package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pachipeanut extends drai.dev.data.pokemon.Pokemon {
    public Pachipeanut() {
        super("Pachipeanut",
                Type.GRASS,Type.ROCK,
                new Stats(110,
                        90,
                        100,
                        70,
                        90,
                        65),
                List.of(Ability.OVERGROW), Ability.SOLID_ROCK,
                28, 0,
                new Stats(2,0,1,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pachipeanut");

    }


}
