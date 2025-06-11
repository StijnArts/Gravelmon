package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Whirlibyg extends drai.dev.data.pokemon.Pokemon {
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TREE_TOP)
    .build(), List.of());
	
        setCanFly(true);

    }


}
