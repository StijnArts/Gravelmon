package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ventherm extends drai.dev.data.pokemon.Pokemon {
    public Ventherm() {
        super("Ventherm",
                Type.ROCK, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("At the bottom of the ocean, deep within the trenches, there is no light. Life in the abyss is not sustained by the sun, but by undersea vents that spew chemicals."),
                List.of(new EvolutionEntry("volchemo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 13, 34, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Ventherm");

    }


}
