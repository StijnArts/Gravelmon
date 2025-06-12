package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ligniter extends drai.dev.data.pokemon.Pokemon {
    public Ligniter() {
        super("Ligniter",
                Type.ROCK, Type.FIRE,
                new Stats(70,
                        55,
                        100,
                        85,
                        50,
                        30),
                List.of(Ability.FLASH_FIRE), Ability.DROUGHT,
                11, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("conflaracite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"54")))
                ),
                List.of(    new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.INCINERATE,27),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,35),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,41),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ligniter");

    }


}
