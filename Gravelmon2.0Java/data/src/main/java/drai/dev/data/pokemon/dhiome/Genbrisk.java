package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Genbrisk extends drai.dev.data.pokemon.Pokemon {
    public Genbrisk(Stats stats) {
        super("Genbrisk",
                Type.ICE, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This Pokemon is responsible for the frigid temperatures in the Southern Dhiome. Its blizzards are rumored to last for months."),
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
                        new MoveLearnSetEntry(Move.FLIP_TURN,1)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Genbrisk");

    }


}
