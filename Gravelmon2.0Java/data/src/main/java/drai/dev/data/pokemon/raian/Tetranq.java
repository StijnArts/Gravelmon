package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tetranq extends drai.dev.data.pokemon.Pokemon {
    public Tetranq() {
        super("Etranq",
                Type.GRASS,Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STORM_DRAIN), null,
                3, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Cynomotar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Tetranq");

    }


}
