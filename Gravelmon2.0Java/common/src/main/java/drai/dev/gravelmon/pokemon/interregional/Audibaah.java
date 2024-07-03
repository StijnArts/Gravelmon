package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Audibaah extends drai.dev.gravelmon.pokemon.Pokemon {
    public Audibaah() {
        super("Audibaah",
                Type.FAIRY, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("bellabaah", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(          new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.COVET,8),
                        new MoveLearnSetEntry(Move.SPIT_UP,12),
                        new MoveLearnSetEntry(Move.STOCKPILE,12),
                        new MoveLearnSetEntry(Move.SWALLOW,12),
                        new MoveLearnSetEntry(Move.ROUND,16),
                        new MoveLearnSetEntry(Move.REST,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,24),
                        new MoveLearnSetEntry(Move.MIMIC,28),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44)              ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4, List.of(
                    new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Audibaah");

    }


}
