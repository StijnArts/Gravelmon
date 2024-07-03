package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Colistroid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Colistroid() {
        super("Colistroid",
                Type.ROCK, Type.ICE,
                new Stats(60,
                        50,
                        100,
                        70,
                        90,
                        50),
                List.of(Ability.STALL,Ability.STURDY,Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                11, 165,
                new Stats(0,0,1,0,1,0), 120,
                0.0,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Colistroid live in clusters deep inside caves. There are ice gems inside its body which keeps its body at a freezing temperature needed to live."),
                List.of(new EvolutionEntry("galixoid", EvolutionType.TRADE, List.of(),
                        List.of())),
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
                        new MoveLearnSetEntry(Move.EXTRASENSORY,34),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,51)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 46, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Colistroid");

    }


}
