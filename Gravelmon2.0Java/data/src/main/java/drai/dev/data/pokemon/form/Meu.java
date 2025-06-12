package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Meu extends drai.dev.data.pokemon.Pokemon {
    public Meu() {
        super("Meu",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(96,
                        120,
                        96,
                        96,
                        96,
                        96),
                List.of(Ability.SYNCHRONIZE), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .mythical()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Meu");

    }


}
