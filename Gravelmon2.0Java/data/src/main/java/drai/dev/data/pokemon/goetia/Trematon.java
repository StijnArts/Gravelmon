package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trematon extends drai.dev.data.pokemon.Pokemon {
    public Trematon(Stats stats) {
        super("Trematon",
                Type.BUG, Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When toxic waste was dumped in a certain area, Helminthon adapted and became this pokemon. Because it feeds on pollution, it has been used in hazardous material cleanup."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Trematon");

    }


}
