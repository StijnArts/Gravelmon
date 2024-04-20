package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Clastroid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clastroid() {
        super("Clastroid",
                Type.ROCK, Type.ICE,
                new Stats(40,
                        40,
                        70,
                        50,
                        65,
                        40),
                List.of(Ability.STALL,Ability.STURDY,Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                7, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.0,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Scientists have traced its tracks coming from a planet outside our solar system. The planet is covered in ice and only these Pokemon were found to be inhabiting it."),
                List.of(new EvolutionEntry("colistroid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.ICE_SHARD,7),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,10),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,14),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,17),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,20),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,23),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,27),
                        new MoveLearnSetEntry(Move.ICE_BEAM,30),
                        new MoveLearnSetEntry(Move.PROTECT,33),
                        new MoveLearnSetEntry(Move.POWER_GEM,36),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clastroid");

    }


}
