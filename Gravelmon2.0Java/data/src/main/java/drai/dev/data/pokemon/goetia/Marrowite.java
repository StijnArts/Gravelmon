package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marrowite extends drai.dev.data.pokemon.Pokemon {
    public Marrowite(Stats stats) {
        super("Marrowite",
                Type.BUG, Type.GHOST,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It mourns the Chumbas it could not keep safe. Forced to fend for itself, it slashes at everything that gets near it with its six bladed arms"),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_WARM_OCEAN, Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Marrowite");

    }


}
