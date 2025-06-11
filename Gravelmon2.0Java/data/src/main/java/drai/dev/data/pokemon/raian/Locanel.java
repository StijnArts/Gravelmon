package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Locanel extends drai.dev.data.pokemon.Pokemon {
    public Locanel(Stats stats) {
        super("Locanel",
                Type.FIRE,Type.WATER,
                stats,
                List.of(Ability.BLAZE), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanWalkOnWater(true);
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Locanel");

    }


}
