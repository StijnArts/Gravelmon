package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kaplantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kaplantis() {
        super("Kaplantis",
                Type.ROCK,Type.WATER,
                new Stats(150,
                        60,
                        120,
                        140,
                        60,
                        50),
                List.of(Ability.SOLID_ROCK), Ability.PRESSURE,
                34, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,12),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,32),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,36),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,42),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.OCEAN_MONUMENT, SpawnPreset.OCEAN_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Kaplantis");

    }


}
