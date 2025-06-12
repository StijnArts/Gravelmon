package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jamowar extends drai.dev.data.pokemon.Pokemon {
    public Jamowar() {
        super("Jamowar",
                Type.GRASS,Type.POISON,
                new Stats(70,
                        72,
                        72,
                        115,
                        115,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 183,
                new Stats(0,0,0,0,2,0), 115,
                0.5,
                164, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BIRCH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Jamowar");

    }


}
