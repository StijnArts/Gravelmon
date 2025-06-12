package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phanta extends drai.dev.data.pokemon.Pokemon {
    public Phanta() {
        super("Phanta",
                Type.GHOST,
                new Stats(100,
                        90,
                        90,
                        100,
                        100,
                        90),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                8, 165,
                new Stats(1,0,0,1,1,0), 3,
                0.5,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 50, 65, .0016, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
           setLangFileName("Phanta");

    }


}
