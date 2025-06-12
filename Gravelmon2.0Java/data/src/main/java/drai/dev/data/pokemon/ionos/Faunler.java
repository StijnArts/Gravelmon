package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Faunler extends drai.dev.data.pokemon.Pokemon {
    public Faunler() {
        super("Faunler",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("satyrnus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Faunler");

    }


}
