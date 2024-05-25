package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Palosstone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Palosstone() {
        super("Palosstone",
                Type.ROCK, Type.GHOST,
                new Stats(120,
                        85,
                        115,
                        70,
                        60,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,25),
                        new MoveLearnSetEntry(Move.HYPNOSIS,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,35),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.SHORE_UP,55),
                        new MoveLearnSetEntry(Move.SANDSTORM,60)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 42, 55, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palosstone");

    }


}
