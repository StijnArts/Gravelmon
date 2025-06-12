package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pokus extends drai.dev.data.pokemon.Pokemon {
    public Pokus() {
        super("Pokus",
                Type.PSYCHIC,Type.DARK,
                new Stats(109,
                        38,
                        50,
                        59,
                        125,
                        108),
                List.of(Ability.CONTRARY), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pokus");

    }


}
