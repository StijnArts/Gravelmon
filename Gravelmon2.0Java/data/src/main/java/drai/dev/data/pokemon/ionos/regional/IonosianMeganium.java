package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianMeganium extends drai.dev.data.pokemon.Pokemon {
    public IonosianMeganium(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Meganium",
                Type.GRASS, Type.DARK,
                stats,
                List.of(Ability.OVERGROW), Ability.SAND_VEIL,
                21, 0,
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
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Meganium");

    }


}
