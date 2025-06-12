package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanShuckle extends drai.dev.data.pokemon.Pokemon {
    public FormanShuckle(String name, Aspect aspect) {
        super(name, aspect, "FormanShuckle",
                Type.BUG,Type.NUCLEAR,
                new Stats(63,
                        67,
                        130,
                        67,
                        130,
                        46),
                List.of(Ability.CONTRARY), null,
                12, 0,
                new Stats(0,0,0,0,0,0), 120,
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
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shuckle");

    }


}
