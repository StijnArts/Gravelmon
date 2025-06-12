package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Queshroom extends drai.dev.data.pokemon.Pokemon {
    public Queshroom() {
        super("Queshroom",
                Type.FAIRY,Type.FIRE,
                new Stats(77,
                        41,
                        66,
                        113,
                        74,
                        66),
                List.of(), null,
                UnitConverter.feetToMeters(4, 1), 0,
                new Stats(0,0,0,0,0,0), 90,
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
    .setPool(SpawnPool.RARE)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Queshroom");

    }


}
