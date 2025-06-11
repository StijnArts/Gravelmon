package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanLampent extends drai.dev.data.pokemon.Pokemon {
    public LagoonanLampent(String name, Aspect aspect) {
        super(name, aspect, "Lampent",
                Type.FIRE,Type.GRASS,
                new Stats(60,
                        40,
                        60,
                        95,
                        60,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 130,
                new Stats(0,0,0,2,0,0), 50,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lampent");

    }


}
