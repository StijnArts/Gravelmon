package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Faelily extends drai.dev.data.pokemon.Pokemon {
    public Faelily() {
        super("Faelily",
                Type.WATER, Type.GRASS,
                new Stats(80,
                        60,
                        60,
                        100,
                        120,
                        40),
                List.of(Ability.LEAF_GUARD,Ability.RAIN_DISH,Ability.HYDRATION), Ability.HYDRATION,
                10, 165,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Faelily are gentle Pokemon. They store water in their leaf-bowl, which they then purify. They share the water with Pokemon in need, and can also be seen watering plants and flowers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.LIFE_DEW,8),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.SWEET_KISS,19),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.WATER_PULSE,28),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,37),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,41),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 21, 39, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
