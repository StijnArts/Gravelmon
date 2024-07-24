package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Willowanne extends drai.dev.data.pokemon.Pokemon {
    public Willowanne() {
        super("Willowanne",
                Type.GRASS,
                new Stats(74,
                        100,
                        72,
                        90,
                        72,
                        46),
                List.of(Ability.TANGLED_FEET), Ability.TANGLED_FEET,
                25, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.0,
                159, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Willowanne languidly stroll through fields on sunny days, hoping their dry skin catches alight in a spectacular show of fire."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,16),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,32),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,36),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,40),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,44),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,48),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,52),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,56),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,60)),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE,Biome.IS_WINTER,Biome.IS_SPRING))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Willowanne");

    }


}
