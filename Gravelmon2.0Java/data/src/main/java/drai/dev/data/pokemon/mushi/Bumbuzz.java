package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bumbuzz extends drai.dev.data.pokemon.Pokemon {
    public Bumbuzz() {
        super("Bumbuzz",
                Type.BUG,Type.ELECTRIC,
                new Stats(55,
                        85,
                        65,
                        70,
                        50,
                        110),
                List.of(Ability.STATIC,Ability.VOLT_ABSORB), Ability.UNBURDEN,
                11, 0,
                new Stats(0,0,0,0,0,2), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(16)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Bumbuzz");

    }


}
