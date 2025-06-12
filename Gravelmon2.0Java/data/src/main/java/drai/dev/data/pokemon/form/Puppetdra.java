package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Puppetdra extends drai.dev.data.pokemon.Pokemon {
    public Puppetdra() {
        super("Puppetdra",
                Type.DRAGON,Type.DARK,
                new Stats(94,
                        49,
                        80,
                        116,
                        89,
                        102),
                List.of(Ability.RAGINGSCALE), null,
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
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Puppetdra");

    }


}
