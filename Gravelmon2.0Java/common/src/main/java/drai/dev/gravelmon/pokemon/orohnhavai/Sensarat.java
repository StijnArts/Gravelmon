package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sensarat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sensarat() {
        super("Sensarat",
                Type.NORMAL,
                new Stats(75,
                        80,
                        57,
                        45,
                        73,
                        90),
                List.of(Ability.FRISK,Ability.ANTICIPATION,Ability.TELEPATHY), Ability.TELEPATHY,
                8, 165,
                new Stats(0,1,0,0,0,1), 90,
                0.5,
                132, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Nearly blind, it uses its whiskers, nose and ears to help guide its way. It can literally eat anything; from leftovers to garbage. Its acute senses allow it to scavenge unnoticed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,15),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,18),
                        new MoveLearnSetEntry(Move.DETECT,20),
                        new MoveLearnSetEntry(Move.CRUNCH,23),
                        new MoveLearnSetEntry(Move.HYPER_FANG,27),
                        new MoveLearnSetEntry(Move.ME_FIRST,32),
                        new MoveLearnSetEntry(Move.SUPER_FANG,36),
                        new MoveLearnSetEntry(Move.LOCKON,41),
                        new MoveLearnSetEntry(Move.FLAIL,45),
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
           setLangFileName("Sensarat");

    }


}
