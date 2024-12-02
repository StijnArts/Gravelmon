package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hazmoz extends drai.dev.data.pokemon.Pokemon {
    public Hazmoz() {
        super("Hazmoz",
                Type.POISON,Type.BUG,
                new Stats(30,
                        47,
                        25,
                        50,
                        25,
                        50),
                List.of(Ability.CORROSION), Ability.CORROSION,
                3, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("chemisquito", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 25, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Hazmoz");

    }


}
