package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Twirleef extends drai.dev.data.pokemon.Pokemon {
    public Twirleef() {
        super("Twirleef",
                Type.GRASS,
                new Stats(59,
                        55,
                        75,
                        78,
                        55,
                        89),
                List.of(Ability.OVERGROW), Ability.RIPEN,
                0, 0,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- AbsorbSTAB Grass - Sludge Poison - Scratch Normal 7 Leech Seed Grass 13 Mega DrainSTAB Grass 18 Double Kick Fighting 24 Hex Ghost 28 Toxic Poison 38 Seed BombSTAB Grass 42 Sludge Bomb Poison 46 Leaf StormSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,7),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,18),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.TOXIC,28),
                        new MoveLearnSetEntry(Move.SEED_BOMB,38),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,42),
                        new MoveLearnSetEntry(Move.LEAF_STORM,46)                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Twirleef");

    }


}
