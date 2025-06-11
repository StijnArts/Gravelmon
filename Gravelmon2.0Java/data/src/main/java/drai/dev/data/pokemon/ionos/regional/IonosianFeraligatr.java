package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianFeraligatr extends drai.dev.data.pokemon.Pokemon {
    public IonosianFeraligatr(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Feraligatr",
                Type.WATER, Type.STEEL,
                stats,
                List.of(Ability.TORRENT), Ability.STRONG_JAW,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Feraligatr");

    }


}
