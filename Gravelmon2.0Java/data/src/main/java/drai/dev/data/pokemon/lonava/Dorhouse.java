package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dorhouse extends drai.dev.data.pokemon.Pokemon {
    public Dorhouse() {
        super("Dorhouse",
                Type.NORMAL,
                new Stats(30,
                        56,
                        35,
                        25,
                        35,
                        72),
                List.of(Ability.RUN_AWAY), Ability.PICKUP,
                3, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Dorhouse carry around a hollowed wooden stump, which at night they climb inside and sleep. Locals know not to disturb the stumps should they find one, instead leaving fruit offerings outside."),
                List.of(new EvolutionEntry("nomadent", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.REST,19),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,22),
                        new MoveLearnSetEntry(Move.GYRO_BALL,25),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,29),
                        new MoveLearnSetEntry(Move.AMNESIA,32),
                        new MoveLearnSetEntry(Move.SLAM,35),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,38),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,44),
                        new MoveLearnSetEntry(Move.LAST_RESORT,50)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dorhouse");

    }


}
