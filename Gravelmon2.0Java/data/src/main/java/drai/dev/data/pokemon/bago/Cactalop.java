package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cactalop extends drai.dev.data.pokemon.Pokemon {
    public Cactalop() {
        super("Cactalop",
                Type.GRASS,
                new Stats(63,
                        113,
                        66,
                        33,
                        66,
                        96),
                List.of(Ability.IRON_BARBS, Ability.WATER_ABSORB), Ability.SAND_RUSH,
                UnitConverter.feetToMeters(4, 11), 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cactalop");

    }


}
