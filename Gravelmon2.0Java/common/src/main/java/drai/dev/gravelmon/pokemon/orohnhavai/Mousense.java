package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mousense extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mousense() {
        super("Mousense",
                Type.NORMAL,
                new Stats(45,
                        45,
                        35,
                        25,
                        45,
                        55),
                List.of(Ability.RUN_AWAY,Ability.ANTICIPATION,Ability.TELEPATHY), Ability.TELEPATHY,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A common sight throughout the Havai region. Its whiskers allow it to sense any changes in its surroundings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,15),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,18),
                        new MoveLearnSetEntry(Move.CRUNCH,22),
                        new MoveLearnSetEntry(Move.HYPER_FANG,25),
                        new MoveLearnSetEntry(Move.ME_FIRST,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,32),
                        new MoveLearnSetEntry(Move.LOCKON,36),
                        new MoveLearnSetEntry(Move.FLAIL,39),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mousense");

    }


}