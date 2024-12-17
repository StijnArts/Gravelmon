package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mouszerker extends drai.dev.data.pokemon.Pokemon {
    public Mouszerker() {
        super("Mouszerker",
                Type.FAIRY, Type.STEEL,
                new Stats(133,
                        107,
                        81,
                        50,
                        63,
                        41),
                List.of(Ability.VOLT_ABSORB), Ability.SHEER_FORCE,
                13, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mouszerkers are brutal fighters, driven mad by their fostered hatred of the digital world. They are fierce rivals of Mouscalibur, and will often challenge them to duels."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,5),
                        new MoveLearnSetEntry(Move.METAL_CLAW,8),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,22),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,26),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,30),
                        new MoveLearnSetEntry(Move.IRON_TAIL,34),
                        new MoveLearnSetEntry(Move.STORM_THROW,38),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,42),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,47),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,51),
                        new MoveLearnSetEntry(Move.SKULL_BASH,55),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,60),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Mouszerker");

    }


}
