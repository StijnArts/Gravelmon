package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanRaikou extends drai.dev.data.pokemon.Pokemon {
    public FormanRaikou(String name, Aspect aspect) {
        super(name, aspect, "FormanRaikou",
                Type.STEEL,
                new Stats(83,
                        126,
                        87,
                        44,
                        111,
                        126),
                List.of(Ability.CLEAR_BODY), null,
                21, 0,
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
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Raikou");

    }


}
