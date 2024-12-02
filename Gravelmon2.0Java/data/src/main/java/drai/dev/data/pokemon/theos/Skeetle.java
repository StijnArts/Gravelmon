package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skeetle extends drai.dev.data.pokemon.Pokemon {
    public Skeetle() {
        super("Skeetle",
                Type.ROCK, Type.BUG,
                new Stats(40,
                        50,
                        60,
                        30,
                        60,
                        30),
                List.of(Ability.KLUTZ), Ability.STALWART,
                7, 40,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Skeetle train their muscles by rolling around a large rock all day. As it gets easier to push, they increase the size of their rock, the alpha of the colony having the largest."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skeetle");

    }


}
