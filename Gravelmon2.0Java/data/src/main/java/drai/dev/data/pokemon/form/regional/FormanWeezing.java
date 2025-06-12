package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanWeezing extends drai.dev.data.pokemon.Pokemon {
    public FormanWeezing(String name, Aspect aspect) {
        super(name, aspect, "FormanWeezing",
                Type.ELECTRIC,Type.POISON,
                new Stats(106,
                        37,
                        82,
                        110,
                        106,
                        45),
                List.of(Ability.CHARGING), null,
                13, 0,
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .isThundering()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Weezing");

    }


}
