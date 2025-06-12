package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coonkaboom extends drai.dev.data.pokemon.Pokemon {
    public Coonkaboom() {
        super("Coonkaboom",
                Type.FIRE,Type.ELECTRIC,
                new Stats(70,
                        100,
                        60,
                        115,
                        70,
                        110),
                List.of(Ability.BLAZE), Ability.RECKLESS,
                18, 0,
                new Stats(0,0,0,2,0,1), 45,
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
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Coonkaboom");

    }


}
