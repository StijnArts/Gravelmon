package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Soljailer extends drai.dev.data.pokemon.Pokemon {
    public Soljailer() {
        super("Soljailer",
                Type.ROCK,Type.GHOST,
                new Stats(116,
                        41,
                        138,
                        116,
                        98,
                        23),
                List.of(Ability.ROUGHDIAMOND,Ability.ENERGYJAIL), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
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
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_DEEP_DARK)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.GEMSTONES, SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Soljailer");

    }


}
