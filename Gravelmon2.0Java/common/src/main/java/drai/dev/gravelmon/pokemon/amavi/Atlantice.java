package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Atlantice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atlantice() {
        super("Atlantice",
                Type.WATER,Type.ICE,
                new Stats(150,
                        45,
                        105,
                        80,
                        105,
                        45),
                List.of(Ability.TORRENT), Ability.FILTER,
                15, 3084,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                235, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHILLING_WATER,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,6),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,17),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,23),
                        new MoveLearnSetEntry(Move.TEATIME,28),
                        new MoveLearnSetEntry(Move.FREEZEDRY,34),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,50),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.ROYALDECREE,67),
                        new MoveLearnSetEntry(Move.BLIZZARD,72),
                        new MoveLearnSetEntry(Move.SOAK,78),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,83)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
