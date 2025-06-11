package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Secrebuyo extends drai.dev.data.pokemon.Pokemon {
    public Secrebuyo() {
        super("Secrebuyo",
                Type.FLYING,Type.GHOST,
                new Stats(93,
                        49,
                        80,
                        136,
                        89,
                        80),
                List.of(Ability.PLUCKING,Ability.SACREDDANCE), null,
                17, 0,
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
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Secrebuyo");

    }


}
