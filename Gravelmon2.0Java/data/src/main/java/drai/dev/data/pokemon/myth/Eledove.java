package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Eledove extends Pokemon {
    public Eledove() {
        super("Eledove",
                Type.FLYING, Type.FAIRY,
                new Stats(60,60,45,60,73,71),
                List.of(Ability.BIG_PECKS), Ability.PIXILATE,
                11, 300,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                122, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING),
                List.of("Eledove show off their pretty feathers to attract all kinds of bird pokemon."),
                List.of(new EvolutionEntry("magnidove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SING, 1),
                        new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 7),
                        new MoveLearnSetEntry(Move.SONIC_BOOM, 11),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 15),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 19),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 24),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, 29),
                        new MoveLearnSetEntry(Move.HURRICANE, 34),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 39),
                        new MoveLearnSetEntry(Move.ROOST, 44),
                        new MoveLearnSetEntry(Move.TAILWIND, 49),
                        new MoveLearnSetEntry(Move.STARBOLT, 54),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 59),
                        new MoveLearnSetEntry(Move.MOONBLAST, 62),
                        new MoveLearnSetEntry(Move.HURRICANE, 64),

                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "egg"),
                        new MoveLearnSetEntry(Move.UPROAR, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 20, 45, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL, Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
        setHasGenderDifferences(true);
    }
}
