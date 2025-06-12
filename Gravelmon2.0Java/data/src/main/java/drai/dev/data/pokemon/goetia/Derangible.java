package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Derangible extends drai.dev.data.pokemon.Pokemon {
    public Derangible(Stats stats) {
        super("Derangible",
                Type.ELECTRIC, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It floats through the clouds, guided by electrical circuits in the atmosphere. The gas in its float becomes supercharged when it absorbs lightning."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanFly(true);
           setLangFileName("Derangible");

    }


}
