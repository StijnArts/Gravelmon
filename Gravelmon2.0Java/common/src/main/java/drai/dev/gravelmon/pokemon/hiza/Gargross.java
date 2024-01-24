package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gargross extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gargross() {
        super("Gargross",
                Type.ROCK,Type.FLYING,
                new Stats(40,
                        55,
                        85,
                        40,
                        40,
                        50),
                List.of(Ability.UNBURDEN), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("Gargross can be often seem carrying rocks as they fly. They select the best looking ones to build their nests."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,17),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,36),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,40),
                        new MoveLearnSetEntry(Move.SKY_DROP,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gargross");

    }


}
