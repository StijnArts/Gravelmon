package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Swove extends Pokemon {
    public Swove() {
        super("Swove",
                Type.FLYING, Type.FAIRY,
                new Stats(40,55,40,56,45,35),
                List.of(Ability.BIG_PECKS), Ability.PIXILATE,
                3, 18,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING),
                List.of("Swove often move in groups of 4 until they grow older to prevent being easy targets for their prey."),
                List.of(new EvolutionEntry("eledove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SING, 5),
                        new MoveLearnSetEntry(Move.GUST, 9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 13),
                        new MoveLearnSetEntry(Move.SONIC_BOOM, 17),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 21),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, 27),
                        new MoveLearnSetEntry(Move.AGILITY, 29),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 33),
                        new MoveLearnSetEntry(Move.ROOST, 37),
                        new MoveLearnSetEntry(Move.TAILWIND, 41),
                        new MoveLearnSetEntry(Move.STARBOLT, 45),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 49),
                        new MoveLearnSetEntry(Move.MOONBLAST, 50),
                        new MoveLearnSetEntry(Move.HURRICANE, 53),

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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.0, List.of(
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
