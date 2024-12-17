package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gummigibbon extends drai.dev.data.pokemon.Pokemon {
    public Gummigibbon() {
        super("Gummigibbon",
                Type.FIGHTING,
                new Stats(60,
                        95,
                        76,
                        66,
                        75,
                        98),
                List.of(Ability.IRON_FIST), Ability.IRON_FIST,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 57, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gummigibbon");

    }


}
