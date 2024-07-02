package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Feefish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Feefish() {
        super("Feefish",
                Type.WATER,
                new Stats(40,
                        60,
                        35,
                        45,
                        35,
                        95),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("fencette", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"day\""))),
                        new EvolutionEntry("feegremin", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(  new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.PECK,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.SWAGGER,22),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,25),
                        new MoveLearnSetEntry(Move.BRINE,29),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,32),
                        new MoveLearnSetEntry(Move.MIST,36),
                        new MoveLearnSetEntry(Move.DRILL_PECK,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 7, 28, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
