package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Flamelin extends Pokemon {
    public Flamelin() {
        super("Flamelin",
                Type.FIRE, Type.SOUND,
                new Stats(75,70,110,80,95,110),
                List.of(Ability.BLAZE), Ability.SOLAR_POWER,
                15, 500,
                new Stats(0,0,1,0,1,1), 45,
                0.875,
                263, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.EMBER, 5),
                        new MoveLearnSetEntry(Move.CONFUSION, 7),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 10),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 13),
                        new MoveLearnSetEntry(Move.ROUND, 16),
                        new MoveLearnSetEntry(Move.YAWN, 19),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 22),
                        new MoveLearnSetEntry(Move.PSYBEAM, 25),
                        new MoveLearnSetEntry(Move.CALM_MIND, 28),
                        new MoveLearnSetEntry(Move.WILLOWISP, 31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 37),
                        new MoveLearnSetEntry(Move.DREAM_EATER, 39),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, 42),
                        new MoveLearnSetEntry(Move.INFERNO, 44),
                        new MoveLearnSetEntry(Move.OVERHEAT, 47)
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 32, 45, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
