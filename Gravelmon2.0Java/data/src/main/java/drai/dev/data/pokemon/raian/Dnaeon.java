package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dnaeon extends drai.dev.data.pokemon.Pokemon {
    public Dnaeon(Stats stats) {
        super("Dnaeon",
                Type.BLOOD,
                stats,
                List.of(Ability.HYPE), null,
                13, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_CRIMSON)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dnaeon");
        addAdditionalEvolution("eevee", new EvolutionEntry("Dnaeon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:spider_eye"));
    }


}
