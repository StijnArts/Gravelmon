package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barrelape extends drai.dev.data.pokemon.Pokemon {
    public Barrelape() {
        super("Barrelape",
                Type.GRASS,Type.FIGHTING,
                new Stats(93,
                        113,
                        110,
                        60,
                        65,
                        74),
                List.of(Ability.GORILLA_TACTICS), Ability.MOLD_BREAKER,
                21, 0,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("As an act of aggression, this pokemon will violently beat its chest with its sturdy armoured hands, creating a sound similar to bongos. This pokemon will hoard large amounts of Nanab berries in their dens which they will defend with their life."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Barrelape");

    }


}
