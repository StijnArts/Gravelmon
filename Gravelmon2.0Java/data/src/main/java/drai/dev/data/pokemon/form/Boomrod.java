package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boomrod extends drai.dev.data.pokemon.Pokemon {
    public Boomrod() {
        super("Boomrod",
                Type.STEEL,Type.FIRE,
                new Stats(70,
                        126,
                        74,
                        37,
                        74,
                        106),
                List.of(Ability.FLASH_FIRE), null,
                12, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Boomrod");

    }


}
