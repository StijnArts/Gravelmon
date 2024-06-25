package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Volcunn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Volcunn(Stats stats) {
        super("Volcunn",
                Type.FIRE, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                36, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,6),
                        new MoveLearnSetEntry(Move.TAR_SHOT,12),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.AMNESIA,24),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,36),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,42),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,48),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,54),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,60)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 61, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Volcunn");

    }


}
