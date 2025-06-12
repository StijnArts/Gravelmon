package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Groggymog extends drai.dev.data.pokemon.Pokemon {
    public Groggymog() {
        super("Groggymog",
                Type.NORMAL,
                new Stats(100,
                        80,
                        110,
                        65,
                        65,
                        55),
                List.of(Ability.THICK_FAT), Ability.GLUTTONY,
                18, 0,
                new Stats(1,0,2,0,0,0), 70,
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
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Groggymog");

    }


}
