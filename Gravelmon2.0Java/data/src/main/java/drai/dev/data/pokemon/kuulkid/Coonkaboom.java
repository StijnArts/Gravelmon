package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coonkaboom extends drai.dev.data.pokemon.Pokemon {
    public Coonkaboom() {
        super("Coonkaboom",
                Type.FIRE,Type.ELECTRIC,
                new Stats(70,
                        100,
                        60,
                        115,
                        70,
                        110),
                List.of(Ability.BLAZE), Ability.RECKLESS,
                18, 0,
                new Stats(0,0,0,2,0,1), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coonkaboom");

    }


}
