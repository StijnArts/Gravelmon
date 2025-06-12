package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sawantina extends drai.dev.data.pokemon.Pokemon {
    public Sawantina() {
        super("Sawantina",
                Type.POISON,Type.FAIRY,
                new Stats(90,
                        131,
                        77,
                        47,
                        85,
                        77),
                List.of(), null,
                UnitConverter.feetToMeters(4, 10), 0,
                new Stats(0,0,0,0,0,0), 45,
                0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ALDAO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_DEEP_DARK)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Sawantina");

    }


}
