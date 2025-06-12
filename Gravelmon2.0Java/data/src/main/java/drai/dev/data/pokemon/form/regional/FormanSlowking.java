package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSlowking extends drai.dev.data.pokemon.Pokemon {
    public FormanSlowking(String name, Aspect aspect) {
        super(name, aspect, "FormanSlowking",
                Type.GHOST,Type.WATER,
                new Stats(106,
                        37,
                        106,
                        126,
                        90,
                        21),
                List.of(Ability.MOISTMIST), null,
                18, 0,
                new Stats(0,0,0,0,0,0), 90,
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
    .setMinLevel(37)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_SOUL_SAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slowking");

    }


}
