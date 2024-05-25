package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Carnaceous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carnaceous() {
        super("Carnaceous",
                Type.GRASS,
                new Stats(120,
                        90,
                        80,
                        70,
                        100,
                        35),
                List.of(Ability.NATURAL_CURE,Ability.FILTER,Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                15, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Carnaceous root themselves, hiding their faces behind their foliage, before ambushing their prey. They can lie sleeping for months before being accidentally awakened by unwary explorers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,12),
                        new MoveLearnSetEntry(Move.INGRAIN,17),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,23),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,36),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,41),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,49),
                        new MoveLearnSetEntry(Move.NATURE_POWER,53),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 56, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carnaceous");

    }


}
