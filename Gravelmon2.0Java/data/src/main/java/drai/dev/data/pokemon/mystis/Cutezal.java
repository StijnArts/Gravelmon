package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cutezal extends drai.dev.data.pokemon.Pokemon {
    public Cutezal() {
        super("Cutezal",
                Type.FLYING,
                new Stats(40,
                        50,
                        45,
                        60,
                        45,
                        40),
                List.of(Ability.BIG_PECKS), Ability.BIG_PECKS,
                4, 0,
                new Stats(0,0,0,0,0,0), 20,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("quetsun", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_JUNGLE.getId() + ":" + Biome.IS_JUNGLE.getName()))),
                        new EvolutionEntry("vivility", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_SAVANNA.getId() + ":" + Biome.IS_SAVANNA.getName()))),
                        new EvolutionEntry("levinity", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_SPOOKY.getId() + ":" + Biome.IS_SPOOKY.getName())))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cutezal");

    }


}
