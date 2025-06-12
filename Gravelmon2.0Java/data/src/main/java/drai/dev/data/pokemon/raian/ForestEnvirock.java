package drai.dev.data.pokemon.raian;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ForestEnvirock extends drai.dev.data.pokemon.Pokemon {
    public ForestEnvirock(String s, Aspect forest, Stats stats) {
        super(s, forest, "Envirock",
                Type.ROCK, Type.GRASS,
                stats,
                List.of(), null,
                5, 0,
                new Stats(0,0,0,0,0,0), 100,
                -1,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Envirock");

    }
}
