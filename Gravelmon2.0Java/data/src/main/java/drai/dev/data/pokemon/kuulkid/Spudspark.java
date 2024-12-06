package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelsextendedbattles.resorting.*;

import java.util.*;
public class Spudspark extends drai.dev.data.pokemon.Pokemon {
    public Spudspark() {
        super("Spudspark",
                Type.ELECTRIC,
                new Stats(41,
                        42,
                        43,
                        59,
                        45,
                        52),
                List.of(Ability.STATIC), Ability.LIGHTNING_ROD,
                4, 0,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Underneath their rough, earthy exterior, this pokemon is packed with electrical charge. The heat caused by the sheer amount of electricity in their system cooks them from the inside."),
                List.of(new EvolutionEntry("deepfried", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.CHARGE.getName())))	),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Spudspark");
        GravelmonMoveSubstitution.registerMoveInsertion("spudspark", new MoveLearnSetEntry(Move.CHARGE, 28));

    }


}
