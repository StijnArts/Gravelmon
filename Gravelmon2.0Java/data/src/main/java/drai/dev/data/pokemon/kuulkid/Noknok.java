package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Noknok extends drai.dev.data.pokemon.Pokemon {
    public Noknok() {
        super("Noknok",
                Type.NORMAL,
                new Stats(30,
                        58,
                        35,
                        55,
                        40,
                        60),
                List.of(Ability.PICKUP), Ability.FRUGAL,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("longjohn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=dark\"")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 37, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Noknok");

    }


}
