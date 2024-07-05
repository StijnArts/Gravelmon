package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slicoth extends drai.dev.data.pokemon.Pokemon {
    public Slicoth() {
        super("Slowth",
                Type.GRASS,
                new Stats(82,
                        76,
                        60,
                        55,
                        67,
                        10),
                List.of(Ability.GRASS_PELT), Ability.STALL,
                7, 202,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Slowth are extremely slow Pokémon, but what they lack in speed they make up for in attack. Their claws are super sharp, capable of slicing down a tree with ease."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slowth");

    }


}
