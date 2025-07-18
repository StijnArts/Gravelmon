package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tinvader extends drai.dev.data.pokemon.Pokemon {
    public Tinvader() {
        super("Tinvader",
                Type.STEEL,Type.NORMAL,
                new Stats(97,
                        67,
                        89,
                        100,
                        60,
                        48),
                List.of(Ability.PANICSHIELD), Ability.PANICSHIELD,
                13, 0,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Tinvaders seem to communicate in a language unintelligible to humans. They can fire a pulse from their arm cannons that can scan their surroundings for potential threats."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tinvader");

    }


}
