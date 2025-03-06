package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Asawaji extends drai.dev.data.pokemon.Pokemon {
    public Asawaji() {
        super("Asawaji",
                Type.FAIRY,
                new Stats(63,
                        56,
                        78,
                        66,
                        81,
                        116),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                6, 8,
                new Stats(0,0,0,0,0,2), 45,
                0.0,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Most often seen roaming deserted ruins from an age long past, Asawaji act as some sort of defender. Perhaps no one told them the ruins they patrol are no longer in use."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,6),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,10),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,14),
                        new MoveLearnSetEntry(Move.FAKE_OUT,18),
                        new MoveLearnSetEntry(Move.LIFE_DEW,22),
                        new MoveLearnSetEntry(Move.CUDDLE,26),
                        new MoveLearnSetEntry(Move.BRINE,31),
                        new MoveLearnSetEntry(Move.WISH,35),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,39),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,42),
                        new MoveLearnSetEntry(Move.BEACHTIDE,46),
                        new MoveLearnSetEntry(Move.LAST_RESORT,51),
                        new MoveLearnSetEntry(Move.HEALING_WISH,57)          ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 44, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Asawaji");

    }


}
