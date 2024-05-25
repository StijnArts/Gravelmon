package drai.dev.gravelmon.pokemon.umbra;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Carapad extends Pokemon {
    public Carapad() {
        super("Carapad",
                Type.GRASS, Type.WATER,
                new Stats(45,
                        20,
                        45,
                        30,
                        40,
                        20),
                List.of(Ability.RAIN_DISH, Ability.SAP_SIPPER), Ability.HYDRATION,
                4, 83,
                new Stats(1,0,0,0,0,0), 225,
                0.5,
                40, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.GRASS),
                List.of("Carapad use their shells to mimic lily pads. People and Pokemon alike often fall for their disguise. But, if disturbed, Carapad will shoot a jet of water at the offender's face."),
                List.of(new EvolutionEntry("puripad", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.GUST, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.RAIN_DANCE.getName()+"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.ABSORB,9),
                        new MoveLearnSetEntry(Move.WATER_SPORT,12),
                        new MoveLearnSetEntry(Move.PROTECT,18),
                        new MoveLearnSetEntry(Move.LEECH_SEED,21),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,24),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,28),
//                        new MoveLearnSetEntry(Move.TRANSPIRATION,28),
                        new MoveLearnSetEntry(Move.NATURE_POWER,31),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,34),
                        new MoveLearnSetEntry(Move.YAWN,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,43),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,46),
                        new MoveLearnSetEntry(Move.SURF,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 7, 31, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.22, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
