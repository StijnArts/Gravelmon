package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cocadeux extends drai.dev.data.pokemon.Pokemon {
    public Cocadeux() {
        super("Cocadeux",
                Type.FLYING, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EARLY_BIRD), Ability.BIG_PECKS,
                9, 0,
                new Stats(0,0,0,0,0,0), 115,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cocatrois", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(17).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TROPICAL, Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cocadeux");

    }


}
