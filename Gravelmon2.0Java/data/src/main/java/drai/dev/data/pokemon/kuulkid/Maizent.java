package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Maizent extends drai.dev.data.pokemon.Pokemon {
    public Maizent() {
        super("Maizent",
                Type.ELECTRIC,
                new Stats(55,
                        85,
                        45,
                        65,
                        60,
                        95),
                List.of(Ability.SUPERCHARGE), Ability.NO_GUARD,
                10, 0,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("bigpop", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 39, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maizent");

    }


}
