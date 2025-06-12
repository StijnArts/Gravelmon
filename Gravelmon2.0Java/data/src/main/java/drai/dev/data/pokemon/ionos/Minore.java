package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Minore extends drai.dev.data.pokemon.Pokemon {
    public Minore() {
        super("Minore",
                Type.ROCK, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("orbiter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MINESHAFT)
    .build(), List.of());
	
           setLangFileName("Minore");

    }


}
