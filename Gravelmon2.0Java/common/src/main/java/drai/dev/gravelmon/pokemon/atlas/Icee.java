package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Icee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Icee() {
        super("Icee",
                Type.ICE,Type.DRAGON,
                new Stats(45,
                        70,
                        50,
                        35,
                        30,
                        60),
                List.of(Ability.ARENA_TRAP), Ability.DRY_SKIN,
                2, 165,
                new Stats(0,1,0,0,0,0), 105,
                0.5,
                75, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("These Pokemon live in such large groups, sometimes they can cover cave floors entirely. They grab passerby's legs and freeze their toes when happy."),
                List.of(new EvolutionEntry("fraxeel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.WRAP,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,12),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,15),
                        new MoveLearnSetEntry(Move.ICE_FANG,19),
                        new MoveLearnSetEntry(Move.DIG,22),
                        new MoveLearnSetEntry(Move.AVALANCHE,26),
                        new MoveLearnSetEntry(Move.ICE_SHARD,30),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,36),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,42),
                        new MoveLearnSetEntry(Move.FREEZEDRY,49),
                        new MoveLearnSetEntry(Move.COIL,54),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SPRING, Biome.IS_SUMMER, Biome.IS_AUTUMN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Icee");

    }


}
