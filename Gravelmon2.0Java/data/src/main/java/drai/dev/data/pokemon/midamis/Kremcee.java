package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kremcee extends drai.dev.data.pokemon.Pokemon {
    public Kremcee() {
        super("Kremcee",
                Type.DARK, Type.NORMAL,
                new Stats(75,
                        65,
                        70,
                        65,
                        70,
                        85),
                List.of(Ability.HYPER_CUTTER), Ability.ROCK_HEAD,
                9, 165,
                new Stats(1,0,0,0,0,1), 140,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("This Pokemon is friendly compared to most other Dark types. Whenever they meet new people or Pokemon they always bow and hands with arm-like ears. They look pretty slow because of that C-shaped rock on their head, but deceptively run pretty fast."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,6),
                        new MoveLearnSetEntry(Move.BARRIER,9),
                        new MoveLearnSetEntry(Move.NATURE_POWER,14),
                        new MoveLearnSetEntry(Move.THIEF,17),
                        new MoveLearnSetEntry(Move.SECRET_POWER,22),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,30),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,33),
                        new MoveLearnSetEntry(Move.PAYBACK,38),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,46),
                        new MoveLearnSetEntry(Move.SUPERPOWER,49),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,54),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 41, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kremcee");

    }


}
