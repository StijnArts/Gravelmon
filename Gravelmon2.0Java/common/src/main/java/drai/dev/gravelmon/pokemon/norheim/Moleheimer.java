package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Moleheimer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moleheimer() {
        super("Moleheimer",
                Type.GROUND, Type.PSYCHIC,
                new Stats(83,
                        92,
                        80,
                        82,
                        88,
                        60),
                List.of(Ability.ARENA_TRAP,Ability.SAND_RUSH,Ability.SECRETINSIGHT), Ability.SECRETINSIGHT,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moleheimer is the greatest navigator in all of Norheim. Its swirl like scars are the remains of countless battles with Beatroot."),
                List.of(),
                List.of(                  new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,9),
                        new MoveLearnSetEntry(Move.POWER_TRICK,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,18),
                        new MoveLearnSetEntry(Move.IMPRISON,21),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,27),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,33),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,38),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,38),
                        new MoveLearnSetEntry(Move.SANDSTORM,43),
                        new MoveLearnSetEntry(Move.EXPLOSION,48)      ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER,Biome.IS_SPRING))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moleheimer");

    }


}
