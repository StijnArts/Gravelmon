package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Clawgigus extends drai.dev.data.pokemon.Pokemon {
    public Clawgigus() {
        super("Clawgigus",
                Type.ROCK, Type.GRASS,
                new Stats(60,
                        125,
                        95,
                        70,
                        70,
                        60),
                List.of(Ability.SHELL_ARMOR,Ability.STAKEOUT,Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                13, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("Clawgigus likes to wait for its pray, blending into a leafy, shady environment with its camouflage. When its target passes by, Clawgigus pounces it and circles it, allowing no room for escape."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,11),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,15),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,18),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,26),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.SANDSHOT,34),
                        new MoveLearnSetEntry(Move.CRABHAMMER,38),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,44),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,56)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 59, .45, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clawgigus");

    }


}
