package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marvelish extends drai.dev.data.pokemon.Pokemon {
    public Marvelish() {
        super("Marvelish",
                Type.WATER, Type.DRAGON,
                new Stats(130,
                        70,
                        95,
                        80,
                        95,
                        70),
                List.of(Ability.SECRETINSIGHT,Ability.MARVEL_SCALE), Ability.MULTISCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Marvelish tends to stand out and is popular among collectors. It fetches for a surprisingly high price as no one seems to have realised that it evolves from Colorlish..."),
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
           setLangFileName("Marvelish");

    }


}
