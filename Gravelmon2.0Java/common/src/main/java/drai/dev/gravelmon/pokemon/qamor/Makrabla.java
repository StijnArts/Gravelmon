package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Makrabla extends drai.dev.gravelmon.pokemon.Pokemon {
    public Makrabla() {
        super("Makrabla",
                Type.WATER,
                new Stats(90,
                        77,
                        72,
                        53,
                        72,
                        56),
                List.of(Ability.TORRENT), Ability.STAKEOUT,
                8, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Makrabla love nothing more then picking fights on lesser Pokemon. They tend to keep in groups, and even start gangs and alliances to keep others away from their territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.WATER_SPORT,8),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,13),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,15),
                        new MoveLearnSetEntry(Move.PURSUIT,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,23),
                        new MoveLearnSetEntry(Move.AQUA_JET,28),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,37),
                        new MoveLearnSetEntry(Move.IRON_TAIL,45),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,54),
                        new MoveLearnSetEntry(Move.LIQUIDATION,60),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SLASH,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Makrabla");

    }


}
