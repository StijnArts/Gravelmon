package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Squicecone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squicecone(Stats stats) {
        super("Squicecone",
                Type.ICE, Type.WATER,
                stats,
                List.of(Ability.ICE_BODY), Ability.LIGHTNING_ROD,
                29, 1100,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Based on: Endoceras"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.TORPEDODASH,1),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,1),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.HORN_DRILL,1),
                        new MoveLearnSetEntry(Move.DRILL_RUN,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.ICYCHARGE,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 23, 47, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN)  ),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Squicecone");

    }


}
