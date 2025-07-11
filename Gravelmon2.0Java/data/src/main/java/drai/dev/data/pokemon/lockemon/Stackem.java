package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Stackem extends Pokemon {
    public Stackem() {
        super("Stackem",
                Type.ROCK,
                new Stats(70,
                        50,
                        40,
                        60,
                        50,
                        120),
                List.of(Ability.PEARL_DROP), Ability.PEARL_DROP,
                7, 335,
                new Stats(0,0,0,0,1,0), 160,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.WATER_3),
                List.of("Stackem are very possessive of the rocks they collect, going to great lengths to protect them. Kaskadian Ambipom and Stackem often fight over stones."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
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
                        new MoveLearnSetEntry(Move.STONE_EDGE,54),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_BEACH)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
