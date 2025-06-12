package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Golbeast extends drai.dev.data.pokemon.Pokemon {
    public Golbeast() {
        super("Golbeast",
                Type.ROCK,Type.STEEL,
                new Stats(87,
                        108,
                        94,
                        46,
                        83,
                        75),
                List.of(Ability.IRON_BARBS), null,
                24, 0,
                new Stats(0,0,0,0,0,0), 45,
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
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.GEMSTONES)
    .build(), List.of());
	
           setLangFileName("Golbeast");

    }


}
