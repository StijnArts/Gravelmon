package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanCorsola extends drai.dev.data.pokemon.Pokemon {
    public FormanCorsola(String name, Aspect aspect) {
        super(name, aspect, "FormanCorsola",
                Type.POISON,Type.ROCK,
                new Stats(110,
                        64,
                        130,
                        31,
                        31,
                        17),
                List.of(Ability.POISON_TOUCH), null,
                6, 0,
                new Stats(0,0,0,0,0,0), 60,
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
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
           setLangFileName("Corsola");

    }


}
