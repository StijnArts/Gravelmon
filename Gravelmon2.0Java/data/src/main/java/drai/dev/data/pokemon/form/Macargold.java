package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Macargold extends drai.dev.data.pokemon.Pokemon {
    public Macargold() {
        super("Macargold",
                Type.ROCK,Type.GROUND,
                new Stats(93,
                        32,
                        111,
                        93,
                        79,
                        18),
                List.of(Ability.SAND_STREAM), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_DEEP_DARK)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.GEMSTONES)
    .build(), List.of());
	
           setLangFileName("Macargold");

    }


}
