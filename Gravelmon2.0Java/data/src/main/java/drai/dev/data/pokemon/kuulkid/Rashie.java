package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rashie extends drai.dev.data.pokemon.Pokemon {
    public Rashie() {
        super("Rashie",
                Type.DARK,
                new Stats(58,
                        60,
                        49,
                        50,
                        40,
                        55),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                6, 0,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The fully developed tusks of Rashies make their playfighting incredibly dangerous. Rashies who bond at birth become lifelong hunting partners, never leaving one another's side."),
                List.of(new EvolutionEntry("gnashrasher", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 29, 3.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rashie");

    }


}
