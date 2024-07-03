package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class QamoranTangrowth extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranTangrowth(String name, Aspect aspect) {
        super(name, aspect, "Tangrowth",
                Type.WATER, Type.DRAGON,
                new Stats(100,
                        110,
                        50,
                        100,
                        125,
                        50),
                List.of(Ability.DELICIOUS), Ability.REGENERATOR,
                20, 165,
                new Stats(0,0,0,0,2,0), 30,
                0.5,
                187, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(

                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,3),
                        new MoveLearnSetEntry(Move.FLASH,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,24),
                        new MoveLearnSetEntry(Move.BRINE,28),
                        new MoveLearnSetEntry(Move.MEMENTO,33),
                        new MoveLearnSetEntry(Move.SCREECH,38),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,43),
                        new MoveLearnSetEntry(Move.RECOVER,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 36, 56, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tangrowth");

    }


}
