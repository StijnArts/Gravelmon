package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Selkreeper extends drai.dev.data.pokemon.Pokemon {
    public Selkreeper() {
        super("Selkreeper",
                Type.GHOST, Type.WATER,
                new Stats(105,
                        80,
                        55,
                        106,
                        62,
                        93),
                List.of(Ability.DISGUISE), Ability.DISGUISE,
                17, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.BUBBLE,11),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,15),
                        new MoveLearnSetEntry(Move.HAZE,21),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,31),
                        new MoveLearnSetEntry(Move.BRINE,35),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,41),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,51),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,61),
                        new MoveLearnSetEntry(Move.GRUDGE,65),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,71),
                        new MoveLearnSetEntry(Move.MEMENTO,75)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 13, 43, 1.3, List.of(
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
