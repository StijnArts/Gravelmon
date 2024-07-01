package drai.dev.gravelmon.pokemon.enjin;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Snooz extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snooz() {
        super("Snooz",
                Type.PSYCHIC,
                new Stats(40,
                        28,
                        25,
                        23,
                        75,
                        22),
                List.of(Ability.OBLIVIOUS,Ability.FOREWARN), Ability.INNER_FOCUS,
                4, 0,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                43, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("drowzee", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"180"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"day\""))),
                        new EvolutionEntry("drowzee enjinnian", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"180"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.SNORE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Snooz");

    }


}
