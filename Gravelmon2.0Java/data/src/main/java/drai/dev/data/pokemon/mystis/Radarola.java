package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Radarola extends drai.dev.data.pokemon.Pokemon {
    public Radarola() {
        super("Radarola",
                Type.STEEL,
                new Stats(55,
                        25,
                        85,
                        75,
                        20,
                        15),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                5, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Researchers argue about whether this Pokémon should be considered a Mystian Roggenrola, as genetic studies have been inconclusive. It can emit weak electromagnetic pulses from the appendage on its head."),
                List.of(new EvolutionEntry("astore", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Radarola");

    }


}
