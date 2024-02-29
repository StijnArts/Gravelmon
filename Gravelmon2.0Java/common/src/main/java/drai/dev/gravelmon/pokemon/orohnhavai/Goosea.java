package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Goosea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Goosea() {
        super("Goosea",
                Type.FLYING,Type.WATER,
                new Stats(45,
                        40,
                        45,
                        50,
                        40,
                        50),
                List.of(Ability.TANGLED_FEET,Ability.SIMPLE,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("It was discovered that Goosea migrate from Orohn-Havai to Avoris in the autumn season. Many of them get lost during their migration because they are clumsy and have short attention spans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.MIST,8),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.WING_ATTACK,16),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,26),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.ROOST,36),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,40),
                        new MoveLearnSetEntry(Move.HURRICANE,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,47),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Goosea");

    }


}
