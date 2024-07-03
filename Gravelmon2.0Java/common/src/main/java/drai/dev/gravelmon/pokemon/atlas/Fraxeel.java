package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Fraxeel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fraxeel() {
        super("Fraxeel",
                Type.ICE, Type.DRAGON,
                new Stats(55,
                        85,
                        60,
                        45,
                        40,
                        70),
                List.of(Ability.ARENA_TRAP), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,2,0,0,0,0), 82,
                0.5,
                140, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("Fraxeel burst out of holes in the middle of the snow, immobilizing their prey with shock. Its teeth are so cold they freeze their victim's blood instantly."),
                List.of(new EvolutionEntry("colosseel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))
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
                        new MoveLearnSetEntry(Move.ICE_SHARD,33),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,46),
                        new MoveLearnSetEntry(Move.FREEZEDRY,53),
                        new MoveLearnSetEntry(Move.COIL,58),
                        new MoveLearnSetEntry(Move.OUTRAGE,68),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 39, 49, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SPRING, Biome.IS_SUMMER, Biome.IS_AUTUMN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fraxeel");

    }


}
