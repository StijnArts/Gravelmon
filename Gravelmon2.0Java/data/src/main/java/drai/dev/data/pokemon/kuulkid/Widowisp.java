package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Widowisp extends drai.dev.data.pokemon.Pokemon {
    public Widowisp() {
        super("Widowisp",
                Type.GHOST,
                new Stats(62,
                        68,
                        61,
                        90,
                        80,
                        80),
                List.of(Ability.DYINGMEMORY), Ability.DYINGMEMORY,
                13, 0,
                new Stats(0,0,0,1,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("When a person enters a period of mourning, their grief manifests into a Widowisp. These pokemon are inconsolable and will tear up over even the smallest disturbances."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Widowisp");

    }


}
