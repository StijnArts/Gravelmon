package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Glacunn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glacunn(Stats stats) {
        super("Glacunn",
                Type.ICE, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                32, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.STOMP,12),
                        new MoveLearnSetEntry(Move.BIDE,16),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,24),
                        new MoveLearnSetEntry(Move.MIST,28),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,32),
                        new MoveLearnSetEntry(Move.ENDURE,40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.BLIZZARD,58)              ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 61, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glacunn");

    }


}
