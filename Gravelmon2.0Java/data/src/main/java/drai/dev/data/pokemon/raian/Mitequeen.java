package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mitequeen extends drai.dev.data.pokemon.Pokemon {
    public Mitequeen(Stats stats) {
        super("Mitequeen",
                Type.BUG,Type.DRAGON,
                stats,
                List.of(Ability.SOILFEEDING), null,
                26, 0,
                new Stats(0,0,0,0,0,0), 30,
                0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 50, 71, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mitequeen");

    }


}
