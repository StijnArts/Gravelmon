package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class YamaTsukami extends drai.dev.data.pokemon.Pokemon {
    public YamaTsukami(Stats stats) {
        super("YamaTsukami",
                Type.GRASS,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An Elder Dragon that floats through the sky. A bite of earth, a drink of forest, it’s a veritable god of the sky made of the richest soil. Ancient trees grow thick on its back like on a mountain."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Yama Tsukami");

    }


}
