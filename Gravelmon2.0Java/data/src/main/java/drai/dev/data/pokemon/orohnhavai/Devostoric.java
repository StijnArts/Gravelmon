package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Devostoric extends drai.dev.data.pokemon.Pokemon {
    public Devostoric() {
        super("Devostoric",
                Type.ROCK, Type.WATER,
                new Stats(75,
                        95,
                        120,
                        80,
                        58,
                        70),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.STRONG_JAW), Ability.STRONG_JAW,
                26, 165,
                new Stats(0,1,1,0,0,0), 25,
                0.667,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("In the waters of Prehistoric Orohn-Havai, Devostoric was an apex predator. Due to its heavy plating, it was a slow but powerful swimmer and relied heavily on its strong beaked mouth to capture food. The great force of their jaw is capable of damaging the hardest of metals."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,17),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,23),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.WATERFALL,29),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.FISHIOUS_REND,47),
                        new MoveLearnSetEntry(Move.JAW_LOCK,49),
                        new MoveLearnSetEntry(Move.SKULL_BASH,53),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,59),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 33, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
