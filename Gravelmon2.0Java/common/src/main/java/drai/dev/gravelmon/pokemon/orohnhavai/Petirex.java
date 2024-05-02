package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Petirex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Petirex() {
        super("Petirex",
                Type.ROCK,
                new Stats(50,
                        85,
                        60,
                        50,
                        45,
                        60),
                List.of(Ability.ROCK_HEAD,Ability.RECKLESS,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                72, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("An ancient Pokemon revived from a Big Tooth Fossil. This Pokemon used to roam the lands in ancient times. Scarcity of food was the reason for its extinction."),
                List.of(new EvolutionEntry("wreckasaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROAR,6),
                        new MoveLearnSetEntry(Move.HEADBUTT,11),
                        new MoveLearnSetEntry(Move.TAUNT,15),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,19),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,23),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,37),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.JAW_LOCK,50),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,54),
                        new MoveLearnSetEntry(Move.STOMP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 21, 45, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Petirex");

    }


}
