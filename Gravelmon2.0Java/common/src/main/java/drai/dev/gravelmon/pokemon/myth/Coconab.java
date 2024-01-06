package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Coconab extends Pokemon {
    public Coconab() {
        super("Coconab",
                Type.GRASS, Type.ROCK,
                new Stats(110,70,100,35,105,35),
                List.of(Ability.THICK_FAT), Ability.RAIN_DISH,
                10, 69,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.BUG),
                List.of("As Cocoling evolves into Coconab, it's shell starts to form a thick layer."),
                List.of(new EvolutionEntry("cocofested", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 3),
                        new MoveLearnSetEntry(Move.ROLLOUT, 7),
                        new MoveLearnSetEntry(Move.WATER_GUN, 10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 13),
                        new MoveLearnSetEntry(Move.WITHDRAW, 15),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 17),
                        new MoveLearnSetEntry(Move.TOXIC, 20),
                        new MoveLearnSetEntry(Move.CALM_MIND, 25),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 27),
                        new MoveLearnSetEntry(Move.AQUA_RING, 29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 33),
                        new MoveLearnSetEntry(Move.RECOVER, 36),
                        new MoveLearnSetEntry(Move.PROTECT, 40)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 41, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
