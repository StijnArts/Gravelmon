package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Caconie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caconie() {
        super("Caconie",
                Type.GHOST, Type.GROUND,
                new Stats(99,
                        100,
                        60,
                        101,
                        90,
                        80),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.BONE_CLUB,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,31),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,35),
                        new MoveLearnSetEntry(Move.FLING,39),
                        new MoveLearnSetEntry(Move.BONEMERANG,43),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,51)               ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Caconie");

    }


}
