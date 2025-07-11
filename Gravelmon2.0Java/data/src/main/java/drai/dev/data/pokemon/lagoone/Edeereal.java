package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Edeereal extends drai.dev.data.pokemon.Pokemon {
    public Edeereal() {
        super("Edeereal",
                Type.GHOST,Type.FIRE,
                new Stats(82,
                        50,
                        50,
                        118,
                        108,
                        92),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 5,
                new Stats(0,0,0,2,0,0), 35,
                0.0,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Edeereal");

    }


}
