package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSkarmory extends drai.dev.data.pokemon.Pokemon {
    public FormanSkarmory(String name, Aspect aspect) {
        super(name, aspect, "FormanSkarmory",
                Type.STEEL,Type.ELECTRIC,
                new Stats(124,
                        35,
                        55,
                        73,
                        148,
                        20),
                List.of(Ability.LEVITATE), null,
                19, 0,
                new Stats(0,0,0,0,0,0), 25,
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
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Skarmory");

    }


}
