package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelsextendedbattles.resorting.*;

import java.util.*;
public class Citpig extends drai.dev.data.pokemon.Pokemon {
    public Citpig() {
        super("Citpig",
                Type.GRASS,Type.PSYCHIC,
                new Stats(60,
                        30,
                        22,
                        75,
                        35,
                        43),
                List.of(Ability.FRISK), Ability.FRISK,
                5, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("boaracle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.PAY_DAY.getName())))	),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 35, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Citpig");

    }


}
