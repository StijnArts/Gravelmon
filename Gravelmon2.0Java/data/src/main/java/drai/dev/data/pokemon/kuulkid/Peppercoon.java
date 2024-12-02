package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peppercoon extends drai.dev.data.pokemon.Pokemon {
    public Peppercoon() {
        super("Peppercoon",
                Type.FIRE,
                new Stats(40,
                        55,
                        40,
                        70,
                        50,
                        60),
                List.of(Ability.BLAZE), Ability.RECKLESS,
                7, 0,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("he source of Peppercoon's firey attacks come from its bushy tail, which glows a bright amber as it heats up. Trainers often have a hard time keeping a Peppercoons as they are always running off to explore their surroundings."),
                List.of(new EvolutionEntry("krakoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peppercoon");

    }


}
