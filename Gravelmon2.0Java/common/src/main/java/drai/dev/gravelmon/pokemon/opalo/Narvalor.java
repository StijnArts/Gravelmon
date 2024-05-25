package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Narvalor extends Pokemon {
    public Narvalor() {
        super("Narvalor",
                Type.WATER, Type.ICE,
                new Stats(105,125,95,75,65,75),
                List.of(Ability.TORRENT), Ability.GUTS,
                19, 52,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                264, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SLASH, 1),
                        new MoveLearnSetEntry(Move.SACRED_SWORD, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.WATER_GUN, 8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 11),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL, 15),
                        new MoveLearnSetEntry(Move.FURY_CUTTER, 20),
                        new MoveLearnSetEntry(Move.ICE_SHARD, 24),
                        new MoveLearnSetEntry(Move.HAZE, 28),
                        new MoveLearnSetEntry(Move.AQUA_JET, 32),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 37),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 41),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 45),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 48),
                        new MoveLearnSetEntry(Move.MEGAHORN, 62),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, 68),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "egg"),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "egg"),
                        new MoveLearnSetEntry(Move.BULK_UP, "egg"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR, "egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.SWAGGER, "egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 45, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
