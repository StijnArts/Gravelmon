package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanLapras extends drai.dev.data.pokemon.Pokemon {
    public FormanLapras(String name, Aspect aspect) {
        super(name, aspect, "FormanLapras",
                Type.ROCK,Type.DRAGON,
                new Stats(116,
                        62,
                        134,
                        116,
                        81,
                        23),
                List.of(Ability.MARVEL_SCALE), null,
                28, 0,
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
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Lapras");
        setCanWalkOnWater(true);

    }


}
