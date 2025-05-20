package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grandorent extends drai.dev.data.pokemon.Pokemon {
    public Grandorent() {
        super("Grandorent",
                Type.NORMAL, Type.GRASS,
                new Stats(95,
                        60,
                        65,
                        75,
                        70,
                        55),
                List.of(Ability.PICKUP,Ability.RUN_AWAY,Ability.CHEEK_POUCH), Ability.CHEEK_POUCH,
                7, 165,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                132, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They spend most of their time up in trees where they build their homes. They enjoy just sitting atop trees and enjoying the view."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.FORESIGHT,11),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.ROUND,25),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,29),
                        new MoveLearnSetEntry(Move.ROLLOUT,33),
                        new MoveLearnSetEntry(Move.SLACK_OFF,38),
                        new MoveLearnSetEntry(Move.AFTER_YOU,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,47),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,50),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 15, 34, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Grandorent");

    }


}
