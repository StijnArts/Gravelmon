package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kittypillar extends drai.dev.data.pokemon.Pokemon {
    public Kittypillar() {
        super("Kittypillar",
                Type.BUG, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its fur is as soft and luxurious as the silk it spins. Having one visit your garden is a sign of great fortune."),
                List.of(new EvolutionEntry("fuzzilk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"13")))),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 17, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE))
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kittypillar");

    }


}
