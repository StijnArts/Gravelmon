package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSuicune extends drai.dev.data.pokemon.Pokemon {
    public FormanSuicune(String name, Aspect aspect) {
        super(name, aspect, "FormanSuicune",
                Type.POISON,
                new Stats(83,
                        44,
                        87,
                        126,
                        111,
                        126),
                List.of(Ability.CLEAR_BODY), null,
                24, 0,
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
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Suicune");

    }


}
