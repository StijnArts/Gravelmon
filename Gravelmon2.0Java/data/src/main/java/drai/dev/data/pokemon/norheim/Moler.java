package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Moler extends drai.dev.data.pokemon.Pokemon {
    public Moler() {
        super("Moler",
                Type.GROUND, Type.PSYCHIC,
                new Stats(62,
                        56,
                        55,
                        45,
                        66,
                        44),
                List.of(Ability.ARENA_TRAP,Ability.SAND_FORCE,Ability.SECRETINSIGHT), Ability.SECRETINSIGHT,
                5, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("moleheimer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_SPRING)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Moler");

    }


}
