package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kristallant extends drai.dev.data.pokemon.Pokemon {
    public Kristallant() {
        super("Kristallant",
                Type.BUG, Type.ROCK,
                new Stats(45,
                        25,
                        95,
                        55,
                        65,
                        40),
                List.of(Ability.MOLD_BREAKER), Ability.OVERCOAT,
                11, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("miniradae", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))
                ),
                List.of(       new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.SLASH,20),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,32),
                        new MoveLearnSetEntry(Move.XSCISSOR,36),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,44),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,48)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kristallant");

    }


}
