package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Galixoid extends drai.dev.data.pokemon.Pokemon {
    public Galixoid() {
        super("Galixoid",
                Type.ROCK, Type.ICE,
                new Stats(80,
                        60,
                        135,
                        95,
                        120,
                        50),
                List.of(Ability.ANALYTIC,Ability.STURDY,Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                21, 165,
                new Stats(0,0,2,0,1,0), 45,
                0.0,
                227, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("A strange rock formation said to have migrated from a frozen planet, where they once guarded an ancient fortress. It is unknown who or what they were guarding, but it is assumed to be a powerful force. It's sturdy features suggests it is built to keep intruders from entering the fortress."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,1),
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
                        new MoveLearnSetEntry(Move.EXTRASENSORY,34),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,51),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,55)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 63, .02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Galixoid");

    }


}
