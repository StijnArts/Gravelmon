package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanEntei extends drai.dev.data.pokemon.Pokemon {
    public FormanEntei(String name, Aspect aspect) {
        super(name, aspect, "FormanEntei",
                Type.ICE,
                new Stats(149,
                        44,
                        126,
                        126,
                        107,
                        25),
                List.of(Ability.CLEAR_BODY), null,
                23, 0,
                new Stats(0,0,0,0,0,0), 3,
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
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GLACIAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Entei");

    }


}
