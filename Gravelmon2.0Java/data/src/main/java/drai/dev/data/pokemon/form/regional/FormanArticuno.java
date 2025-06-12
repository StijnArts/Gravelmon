package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanArticuno extends drai.dev.data.pokemon.Pokemon {
    public FormanArticuno(String name, Aspect aspect) {
        super(name, aspect, "FormanArticuno",
                Type.WATER,Type.FLYING,
                new Stats(83,
                        44,
                        87,
                        126,
                        87,
                        149),
                List.of(Ability.WATER_VEIL), null,
                23, 0,
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
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .isRaining()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Articuno");

    }


}
