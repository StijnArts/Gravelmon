package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pestrina extends drai.dev.data.pokemon.Pokemon {
    public Pestrina() {
        super("Pestrina",
                Type.GRASS, Type.GHOST,
                new Stats(74,
                        107,
                        75,
                        84,
                        65,
                        125),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                0, 0,
                new Stats(0,0,0,0,0,3), 0,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- AbsorbSTAB Grass - Sludge Poison - Shadow SneakSTAB Ghost - Double Team Normal - Scratch Normal 7 Double Kick Fighting 13 Mega DrainSTAB Grass 20 Cross Poison Poison 24 Toxic Poison 29 Night Slash Dark 33 Sludge Bomb Poison 37 Leaf BladeSTAB Grass 42 Shadow ClawSTAB Ghost 47 Venom Drench Poison 52 Swords Dance Normal 58 Gunk Shot Poison 64 Leaf StormSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,7),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.CROSS_POISON,20),
                        new MoveLearnSetEntry(Move.TOXIC,24),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,29),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,37),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,47),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,52),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,58),
                        new MoveLearnSetEntry(Move.LEAF_STORM,64)                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pestrina");

    }


}
