package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianCrudecay extends drai.dev.data.pokemon.Pokemon {
    public MastenianCrudecay(String name, Aspect aspect) {
        super(name, aspect, "Crudecay",
                Type.DARK, Type.FAIRY,
                new Stats(106,
                        106,
                        60,
                        81,
                        106,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crudecay");

    }


}
