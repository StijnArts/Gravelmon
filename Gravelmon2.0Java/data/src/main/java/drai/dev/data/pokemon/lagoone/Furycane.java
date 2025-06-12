package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Furycane extends drai.dev.data.pokemon.Pokemon {
    public Furycane() {
        super("Furycane",
                Type.DRAGON,Type.FLYING,
                new Stats(92,
                        70,
                        70,
                        128,
                        92,
                        83),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 8,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(40)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Furycane");

    }


}
