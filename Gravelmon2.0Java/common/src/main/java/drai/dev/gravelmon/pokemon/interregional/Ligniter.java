package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ligniter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ligniter() {
        super("Ligniter",
                Type.ROCK,Type.FIRE,
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 43, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ligniter");

    }


}
