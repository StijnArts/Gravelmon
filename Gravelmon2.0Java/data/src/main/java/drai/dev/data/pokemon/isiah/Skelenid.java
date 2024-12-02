package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Skelenid extends drai.dev.data.pokemon.Pokemon {
    public Skelenid() {
        super("Skelenid",
                Type.GHOST, Type.GROUND,
                new Stats(96,
                        112,
                        97,
                        65,
                        56,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.BONE_CLUB,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.BONE_RUSH,30),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,35),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,40),
                        new MoveLearnSetEntry(Move.FLING,44),
                        new MoveLearnSetEntry(Move.BONEMERANG,48),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,54),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,61)                  ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 35, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skelenid");

    }


}
