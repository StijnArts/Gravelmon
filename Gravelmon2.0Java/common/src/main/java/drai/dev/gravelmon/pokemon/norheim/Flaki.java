package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Flaki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flaki() {
        super("Flaki",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE,Ability.MAGIC_BOUNCE,Ability.PSYCHIC_SURGE), Ability.PSYCHIC_SURGE,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("oarora", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,16),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,24),
                        new MoveLearnSetEntry(Move.BARRIER,34),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,38),
                        new MoveLearnSetEntry(Move.GRAVITY,42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,48),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,55),
                        new MoveLearnSetEntry(Move.PSYSHOCK,62),
                        new MoveLearnSetEntry(Move.ICE_BEAM,68),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flaki");

    }


}
