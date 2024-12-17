package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Faupent extends drai.dev.data.pokemon.Pokemon {
    public Faupent() {
        super("Faupent",
                Type.GRASS, Type.POISON,
                new Stats(70,
                        115,
                        60,
                        115,
                        60,
                        55),
                List.of(Ability.TANGLING_HAIR), Ability.ARENA_TRAP,
                18, 666,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Faupent sit on the jungle floor imitaing a snake to scare away larger predators while waiting for bird Pokemon to fly overhead. When one does, they quickly shoot up and snatch them out of the sky."),
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
           setLangFileName("Faupent");

    }


}
