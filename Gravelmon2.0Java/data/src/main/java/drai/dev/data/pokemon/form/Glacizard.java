package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glacizard extends drai.dev.data.pokemon.Pokemon {
    public Glacizard() {
        super("Glacizard",
                Type.ICE,
                new Stats(115,
                        40,
                        89,
                        98,
                        137,
                        49),
                List.of(Ability.GLACIERS), null,
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
    .setBiomes(Biome.IS_GLACIAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Glacizard");

    }


}
