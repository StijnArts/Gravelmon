package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Whirlibyg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whirlibyg() {
        super("Whirlibyg",
                Type.GRASS, Type.BUG,
                new Stats(40,
                        30,
                        40,
                        60,
                        45,
                        75),
                List.of(Ability.LEVITATE,Ability.PINWHEEL,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                3, 165,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                58, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("Whirlibyg rotates as it gently floats to the ground. After landing, it climbs the nearest tree to do it all over again. This way, it can cover great distances across the forest much faster than on foot."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
