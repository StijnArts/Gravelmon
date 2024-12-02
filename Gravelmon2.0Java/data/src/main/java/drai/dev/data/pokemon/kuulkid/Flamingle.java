package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamingle extends drai.dev.data.pokemon.Pokemon {
    public Flamingle() {
        super("Flamingle",
                Type.FAIRY,Type.DRAGON,
                new Stats(60,
                        60,
                        45,
                        75,
                        45,
                        55),
                List.of(Ability.ROMANTIC), Ability.CUTE_CHARM,
                7, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("madamingo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=female\""))),
                        new EvolutionEntry("sirmingo", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=male\"")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 43, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flamingle");

    }


}
