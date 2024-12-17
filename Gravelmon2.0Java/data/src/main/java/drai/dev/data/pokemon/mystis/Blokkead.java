package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blokkead extends drai.dev.data.pokemon.Pokemon {
    public Blokkead() {
        super("Blokkead",
                Type.ROCK, Type.NORMAL,
                new Stats(100,
                        80,
                        100,
                        50,
                        80,
                        40),
                List.of(Ability.ROCK_HEAD), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blokkead");

    }


}
