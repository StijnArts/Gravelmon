package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Gneckle extends Pokemon {
    public Gneckle() {
        super("Gneckle",
                Type.DARK,
                new Stats(40,
                        90,
                        45,
                        30,
                        45,
                        30),
                List.of(Ability.SUCTION_CUPS, Ability.MALICE), Ability.DEFIANT,
                3, 31,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                43, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.WATER_1),
                List.of("Gneckle are too weak to completely leave their shell, leaving them in a mostly immobile state. Female Rabyoose will do anything to protect a newborn Gneckle."),
                List.of(new EvolutionEntry("rabyoose", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.THIEF,7),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.WHIRLWIND,16),
                        new MoveLearnSetEntry(Move.PLUCK,20),
                        new MoveLearnSetEntry(Move.TORMENT,24),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,29),
                        new MoveLearnSetEntry(Move.PAYBACK,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,47),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,53),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,60),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 17, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
    }
}
