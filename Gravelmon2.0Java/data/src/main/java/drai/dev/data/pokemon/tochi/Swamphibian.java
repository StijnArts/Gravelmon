package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Swamphibian extends drai.dev.data.pokemon.Pokemon {
    public Swamphibian() {
        super("Swamphibian",
                Type.WATER,
                new Stats(100,
                        70,
                        100,
                        100,
                        75,
                        65),
                List.of(Ability.DAMP), Ability.UNNERVE,
                21, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Swamphibian");

    }


}
