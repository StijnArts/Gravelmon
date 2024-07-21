package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orukul extends drai.dev.data.pokemon.Pokemon {
    public Orukul(Stats stats) {
        super("Orukul",
                Type.ROCK, Type.PSYCHIC,
                stats,
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                14, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Orukul are peaceful Pokemon, composed completely of sentient ore. Because they don't age, they've been around longer than every Pokemon As such, are incredibly intelligent and have boundless wisdom of the past."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FLASH,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,12),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,16),
                        new MoveLearnSetEntry(Move.STORED_POWER,21),
                        new MoveLearnSetEntry(Move.BARRIER,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,33),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,39),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,47),
                        new MoveLearnSetEntry(Move.PSYCHIC,51),
                        new MoveLearnSetEntry(Move.GEMCRASH,55),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,62)                       ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 44, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Orukul");

    }


}
