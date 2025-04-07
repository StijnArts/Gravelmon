package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupshi extends drai.dev.data.pokemon.Pokemon {
    public Pupshi() {
        super("Pupshi",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pupshi enjoys sunbathing on top of cliffs and on old ruins. It may not fear heights but it is terrified of the dark. To journey through the desert nights, it sparks a small fire to light up its surroundings."),
                List.of(new EvolutionEntry("typhur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 31, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupshi");

    }


}
