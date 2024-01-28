package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranTangrowth extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranTangrowth() {
        super("Tangrowth",
                Type.WATER,Type.DRAGON,
                new Stats(100,
                        110,
                        50,
                        100,
                        125,
                        50),
                List.of(Ability.DELICIOUS), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,2,0), 30,
                0.5,
                187, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Evo ScaldSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCALD,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tangrowth");

    }


}
