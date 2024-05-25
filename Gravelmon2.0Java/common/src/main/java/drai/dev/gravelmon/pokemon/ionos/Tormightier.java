package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tormightier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tormightier() {
        super("Tormightier",
                Type.WATER, Type.ICE,
                new Stats(89,
                        97,
                        120,
                        80,
                        102,
                        46),
                List.of(Ability.TORRENT), Ability.REFRIGERATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Toemightier's diet consists of large quantities of H2O and important minerals. Whether it's solid, liquid or gas, the leftover water turns into giant icicle spears whom work as missiles, firing off out of the shell on its back."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.STOMP,6),
                        new MoveLearnSetEntry(Move.ICE_SHARD,10),
                        new MoveLearnSetEntry(Move.WATER_PULSE,14),
                        new MoveLearnSetEntry(Move.ICE_FANG,19),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,33),
                        new MoveLearnSetEntry(Move.BODY_SLAM,38),
                        new MoveLearnSetEntry(Move.LIQUIDATION,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,48),
                        new MoveLearnSetEntry(Move.BODY_PRESS,53),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,59),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,63),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,67),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tormightier");

    }


}
