package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flattery extends drai.dev.data.pokemon.Pokemon {
    public Flattery() {
        super("Flattery",
                Type.ELECTRIC, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Believed to have come from outer space, it absorbs electricity from human settlements. When it approaches, machines begin to malfunction."),
                List.of(new EvolutionEntry("oddcast", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .isThundering()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Flattery");

    }


}
