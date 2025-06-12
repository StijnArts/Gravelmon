package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanChandelure extends drai.dev.data.pokemon.Pokemon {
    public LagoonanChandelure(String name, Aspect aspect) {
        super(name, aspect, "Chandelure",
                Type.FIRE,Type.GRASS,
                new Stats(60,
                        55,
                        90,
                        145,
                        90,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 343,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(41)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Chandelure");

    }


}
