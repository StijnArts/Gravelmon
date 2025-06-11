package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skyviator extends drai.dev.data.pokemon.Pokemon {
    public Skyviator() {
        super("Skyviator",
                Type.FLYING,
                new Stats(83,
                        86,
                        50,
                        75,
                        52,
                        139),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 190,
                new Stats(0,0,0,0,0,2), 100,
                0.5,
                185, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Skyviator");

    }


}
