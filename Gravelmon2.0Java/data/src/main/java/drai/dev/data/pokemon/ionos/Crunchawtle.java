package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crunchawtle extends drai.dev.data.pokemon.Pokemon {
    public Crunchawtle() {
        super("Crunchawtle",
                Type.WATER, Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.STRONG_JAW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Tackle Normal - Withdraw Water 6 Water GunSTAB Water 10 Bite Dark 14 Mist Ice 18 Water PulseSTAB Water 22 Ice FangSTAB Ice 26 Stockpile Normal 30 Razor ShellSTAB Water 35 Crunch Dark 39 Icicle SpearSTAB Ice 45 LiquidationSTAB Water 49 Iron Defense Steel 54 Icicle CrashSTAB Ice 58 Hydro PumpSTAB Water 63 Shell Smash Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.MIST,14),
                        new MoveLearnSetEntry(Move.WATER_PULSE,18),
                        new MoveLearnSetEntry(Move.ICE_FANG,22),
                        new MoveLearnSetEntry(Move.STOCKPILE,26),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,30),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,39),
                        new MoveLearnSetEntry(Move.LIQUIDATION,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,49),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,54),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,58),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,63)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crunchawtle");

    }


}
