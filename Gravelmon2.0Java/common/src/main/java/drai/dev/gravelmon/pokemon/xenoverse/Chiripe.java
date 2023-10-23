package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Chiripe extends Pokemon {
    public Chiripe() {
        super("Chiripe",
                Type.GRASS, Type.FLYING,
                new Stats(45, 40, 43, 65, 55, 65),
                List.of(Ability.OVERGROW), Ability.UNBURDEN,
                4, 38,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                52, List.of(EggGroup.FLYING, EggGroup.GRASS),
                List.of("It has the habit of swinging back and forth while hanging upside down on trees. Because of that, it is usually mistaken for a fruit."),
                List.of(new EvolutionEntry("batnana", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.JET_STRIKE,9),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,18),
                        new MoveLearnSetEntry(Move.AGILITY,21),
                        new MoveLearnSetEntry(Move.PLUCK,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,27),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.SWITCHEROO,32),
                        new MoveLearnSetEntry(Move.LEAF_STORM,36),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.18, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
