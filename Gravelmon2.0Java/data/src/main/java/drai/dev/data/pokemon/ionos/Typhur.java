package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Typhur extends drai.dev.data.pokemon.Pokemon {
    public Typhur() {
        super("Typhur",
                Type.FIRE, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It always watches its back inside crypts and pyramids as it feels the presence of ghost Pokémon. Typhur is even scared of its own shadow, spitting fire against it."),
                List.of(new EvolutionEntry("typhoonos", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 17, 41, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Typhur");

    }


}
