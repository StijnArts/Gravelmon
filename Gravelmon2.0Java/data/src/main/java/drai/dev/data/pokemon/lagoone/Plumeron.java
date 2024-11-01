package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plumeron extends drai.dev.data.pokemon.Pokemon {
    public Plumeron() {
        super("Plumeron",
                Type.NORMAL,Type.FLYING,
                new Stats(53,
                        65,
                        30,
                        50,
                        40,
                        67),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 70,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("kickalon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 4.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plumeron");

    }


}
