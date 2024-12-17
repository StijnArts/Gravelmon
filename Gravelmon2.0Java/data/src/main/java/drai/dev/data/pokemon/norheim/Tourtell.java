package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tourtell extends drai.dev.data.pokemon.Pokemon {
    public Tourtell() {
        super("Tourtell",
                Type.GRASS, Type.GROUND,
                new Stats(120,
                        70,
                        110,
                        70,
                        90,
                        25),
                List.of(Ability.WATER_ABSORB,Ability.DAMP), Ability.SAP_SIPPER,
                18, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tourtell has a peaceful and relaxed nature. Pokemon usually gather on their back to travel across lakes and ponds. History is written on their sturdy bodies."),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.CURSE,17),
                        new MoveLearnSetEntry(Move.BITE,22),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,33),
                        new MoveLearnSetEntry(Move.SYNTHESIS,39),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,57),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,63)),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 9, 27, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Tourtell");

    }


}
