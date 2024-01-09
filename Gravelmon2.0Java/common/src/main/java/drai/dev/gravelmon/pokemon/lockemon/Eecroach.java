package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Eecroach extends Pokemon {
    public Eecroach() {
        super("Eecroach",
                Type.GRASS, Type.BUG,
                new Stats(70,
                        60,
                        55,
                        60,
                        35,
                        70),
                List.of(Ability.SWARMING), Ability.SWARMING,
                11, 135,
                new Stats(3,0,0,0,0,0), 120,
                0.5,
                194, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.GRASS),
                List.of("Eeroach like to go in cities and disguise themselves as weeds in between sidewalks, they look for any sugary foods Pokemon or Humans leave behind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,8),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.LEECH_SEED,22),
                        new MoveLearnSetEntry(Move.ENDURE,29),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,43),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 12, 27, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of(new PokemonForm("Swarm", true,
                        Type.GHOST, Type.DRAGON,
                        new Stats(70, 120, 110, 120, 110, 110),
                        List.of(Ability.SWARMING), Ability.SWARMING,
                        102, 213,
                        new Stats(1, 0, 0, 0, 0, 0), 120,
                        0.5,
                        61, ExperienceGroup.MEDIUM_FAST,
                        70,
                        51, List.of(EggGroup.BUG, EggGroup.GRASS),
                        List.of(Aspect.SWARM),
                        List.of(),
                        List.of(),
                        List.of(
                        ),
                        List.of(Label.LOCKEMON),
                        0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 34, 0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        1.4, 0.3)));
    }
}
