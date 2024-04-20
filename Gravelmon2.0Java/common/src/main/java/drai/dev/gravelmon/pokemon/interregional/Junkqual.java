package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Junkqual extends drai.dev.gravelmon.pokemon.Pokemon {
    public Junkqual() {
        super("Junkqual",
                Type.GROUND, Type.POISON,
                new Stats(97,
                        113,
                        103,
                        113,
                        73,
                        32),
                List.of(Ability.STORM_DRAIN,Ability.STENCH,Ability.PRESSURE), Ability.PRESSURE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Pound Normal - Leer Normal - Water Gun Water - Heavy Slam Steel 4 Mud-SlapSTAB Ground 9 SludgeSTAB Poison 13 Bide Normal 18 Roar Normal 23 Mud BombSTAB Ground 27 Dive Water 33 Stomping TantrumSTAB Ground 37 Recycle Normal 43 Hydro Pump Water 48 Sludge BombSTAB Poison 52 Gunk ShotSTAB Poison 56 Earth PowerSTAB Ground 61 Water Spout Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.BIDE,13),
                        new MoveLearnSetEntry(Move.ROAR,18),
                        new MoveLearnSetEntry(Move.MUD_BOMB,23),
                        new MoveLearnSetEntry(Move.DIVE,27),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,33),
                        new MoveLearnSetEntry(Move.RECYCLE,37),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,48),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52),
                        new MoveLearnSetEntry(Move.EARTH_POWER,56),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,61)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Junkqual");

    }


}
