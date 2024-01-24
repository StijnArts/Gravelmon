package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Puglup extends drai.dev.gravelmon.pokemon.Pokemon {
    public Puglup() {
        super("Puglup",
                Type.NORMAL,
                new Stats(65,
                        54,
                        52,
                        25,
                        46,
                        38),
                List.of(Ability.ROCK_HEAD), Ability.BODYGUARD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Puglup are extremely energetic and excitable Pokemon, and are favorable for young trainers who love being active. Puglup often roughhouse a little too hard, but luckily their thick and durable skulls give them extra protection."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HOWL,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.UPROAR,14),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,17),
                        new MoveLearnSetEntry(Move.GYRO_BALL,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,26),
                        new MoveLearnSetEntry(Move.BLOCK,30),
                        new MoveLearnSetEntry(Move.SUBMISSION,34),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Puglup");

    }


}
