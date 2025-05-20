package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nomadent extends drai.dev.data.pokemon.Pokemon {
    public Nomadent() {
        super("Nomadent",
                Type.NORMAL,
                new Stats(55,
                        81,
                        60,
                        50,
                        70,
                        97),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,2), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Leaving its stump house behind, Nomadent has packed its belongings and taken to the road. They prefer to travel at night, sleeping inside tree hollows during the day."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 38, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nomadent");

    }


}
