package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shockite extends drai.dev.data.pokemon.Pokemon {
    public Shockite() {
        super("Shockite",
                Type.FLYING, Type.ELECTRIC,
                new Stats(67,
                        64,
                        51,
                        73,
                        54,
                        81),
                List.of(Ability.STATIC,Ability.EARLY_BIRD), Ability.LIGHTNING_ROD,
                9, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("falconduct", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(14).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shockite");

    }


}
