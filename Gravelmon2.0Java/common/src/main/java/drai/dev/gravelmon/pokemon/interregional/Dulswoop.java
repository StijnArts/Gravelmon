package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Dulswoop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dulswoop() {
        super("Dulswoop",
                Type.ICE, Type.FLYING,
                new Stats(132,
                        72,
                        70,
                        93,
                        102,
                        61),
                List.of(Ability.ICE_BODY), Ability.SWEET_VEIL,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dulswoop typically only come out during the summer, ironically. During migration, the chocolate they melt off forms a type of delicious rain. Children love to run out with bowls to try and catch the delicious syrup."),
                List.of(),
                List.of(                new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FROST_BREATH,30),
                        new MoveLearnSetEntry(Move.BITE,35),
                        new MoveLearnSetEntry(Move.ICE_FANG,40),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,47),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,54),
                        new MoveLearnSetEntry(Move.CRUNCH,61),
                        new MoveLearnSetEntry(Move.BLIZZARD,68)         ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
