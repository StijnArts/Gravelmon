package drai.dev.data.pokemon.raian;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CaveEnvirock extends drai.dev.data.pokemon.Pokemon {
    public CaveEnvirock(String s, Aspect cave, Stats stats) {
        super(s, cave, "Envirock",
                Type.ROCK, Type.DARK,
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
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Envirock");

    }
}
