package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Saberian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Saberian() {
        super("Saberian",
                Type.ROCK, Type.ICE,
                new Stats(80,
                        140,
                        111,
                        30,
                        70,
                        110),
                List.of(Ability.STRONG_JAW,Ability.SOLID_ROCK,Ability.REFRIGERATE), Ability.REFRIGERATE,
                14, 165,
                new Stats(0,0,0,0,0,0), 40,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite its size and bulky stature, a Saberian can reach a top speed at around 30 mph, sometimes higher if desired. They were the apex predators during the age of the Great Snowfall."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACCELEROCK,1)        ,
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
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40)),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 47, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Saberian");

    }


}
