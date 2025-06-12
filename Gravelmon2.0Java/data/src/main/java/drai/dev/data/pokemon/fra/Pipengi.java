package drai.dev.data.pokemon.fra;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pipengi extends drai.dev.data.pokemon.Pokemon {
    public Pipengi() {
        super("Pipengi",
                Type.FAIRY,Type.ICE,
                new Stats(51,
                        66,
                        63,
                        48,
                        51,
                        92),
                List.of(), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY, Biome.IS_FROZEN_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pipengi");
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }


}
