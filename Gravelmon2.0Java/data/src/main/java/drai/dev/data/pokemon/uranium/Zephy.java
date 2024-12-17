package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Zephy extends Pokemon {
    public Zephy() {
        super("Zephy",
                Type.ELECTRIC, Type.ICE,
                new Stats(110,
                        100,
                        120,
                        110,
                        160,
                        100),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                9, 279,
                new Stats(0,0,0,0,0,1), 3,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A mysterious Mon that appears to be a cross between Plusle and Articuno. In legends, it visited artists and gave them ideas for their next masterpiece."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,10),
                        new MoveLearnSetEntry(Move.NUZZLE,20),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,30),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,40),
                        new MoveLearnSetEntry(Move.AIR_SLASH,50),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,60),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,70),
                        new MoveLearnSetEntry(Move.HURRICANE,80),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,90),
                        new MoveLearnSetEntry(Move.FREEZE_SHOCK,100)
                        ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        setCanFly(true);
    }
}
