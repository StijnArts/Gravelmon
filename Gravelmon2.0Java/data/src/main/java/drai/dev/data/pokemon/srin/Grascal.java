package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grascal extends drai.dev.data.pokemon.Pokemon {
    public Grascal() {
        super("Grascal",
                Type.GRASS,Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.SOUNDPROOF,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Grascal's day consists of collecting nuts along the tree-covered cliffside, only to throw them at its playmates. It creates whistle sounds to call for his gang of other Grascals."),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(5)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grascal");

    }


}
