package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Norspear extends Pokemon {
    public Norspear() {
        super("Norspear",
                Type.WATER, Type.ICE,
                new Stats(90,98,75,65,62,60),
                List.of(Ability.TORRENT), Ability.GUTS,
                12, 52,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("narvalor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.WATER_GUN, 8),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 15),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL, 17),
                        new MoveLearnSetEntry(Move.FURY_CUTTER, 22),
                        new MoveLearnSetEntry(Move.ICE_SHARD, 26),
                        new MoveLearnSetEntry(Move.HAZE, 29),
                        new MoveLearnSetEntry(Move.AQUA_JET, 33),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 37),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 44),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 52),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, 56),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
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
