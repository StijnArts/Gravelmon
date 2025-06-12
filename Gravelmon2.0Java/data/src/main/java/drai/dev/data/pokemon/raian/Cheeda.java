package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cheeda extends drai.dev.data.pokemon.Pokemon {
    public Cheeda() {
        super("Cheeda",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Dameetah", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cheeda");

    }


}
