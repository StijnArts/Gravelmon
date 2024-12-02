package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eldorchard extends drai.dev.data.pokemon.Pokemon {
    public Eldorchard() {
        super("Eldorchard",
                Type.GRASS,
                new Stats(100,
                        120,
                        120,
                        80,
                        70,
                        20),
                List.of(Ability.HARVEST), Ability.NATURAL_CURE,
                15, 165,
                new Stats(0,1,1,0,0,0), 45,
                1.0,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Said to be the spirit of the oldest tree in an apple orchard, local farmers pay tribute to Eldorchard on winter's eve by offering up their last mug of mulled cider. If this Pokemon ever perishes, its entire orchard will perish too."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,4),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.GROWTH,10),
                        new MoveLearnSetEntry(Move.BULLET_SEED,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.INGRAIN,19),
                        new MoveLearnSetEntry(Move.NATURE_POWER,22),
                        new MoveLearnSetEntry(Move.SYNTHESIS,25),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,28),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,31),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,34),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,37),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,40),
                        new MoveLearnSetEntry(Move.LEAF_STORM,44),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,48),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,56),
                        new MoveLearnSetEntry(Move.ORCHARDSEMBRACE,64)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_AUTUMN,Biome.IS_SUMMER, Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eldorchard");

    }


}
