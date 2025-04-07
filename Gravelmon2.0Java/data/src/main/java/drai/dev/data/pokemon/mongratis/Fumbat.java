package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fumbat extends drai.dev.data.pokemon.Pokemon {
    public Fumbat() {
        super("Fumbat",
                Type.FIRE, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, name, type, sprites, and dex entry by Magiscarf on Deviant Art Originally made for Magiscarf's Calta Dex. Evo Line: Complete"),
                List.of(new EvolutionEntry("crucibat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                        Biome.IS_NETHER.getId() + ":" + Biome.IS_NETHER.getName()))),
                        new EvolutionEntry("chimbat", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                Biome.IS_OVERWORLD.getId() + ":" + Biome.IS_OVERWORLD.getName())))),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER, Biome.IS_CAVE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Fumbat");

    }


}
