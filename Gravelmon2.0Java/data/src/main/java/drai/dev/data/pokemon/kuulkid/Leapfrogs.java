package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leapfrogs extends drai.dev.data.pokemon.Pokemon {
    public Leapfrogs() {
        super("Leapfrogs",
                Type.NORMAL,
                new Stats(86,
                        74,
                        53,
                        56,
                        54,
                        59),
                List.of(Ability.SYNCHRONIZE), Ability.FRIEND_GUARD,
                8, 0,
                new Stats(1,1,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Leapfrogs are paired together at birth and share an unbreakable bond. If one Leapfrog falls, the other will take its place in battle."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 41, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Leapfrogs");

    }


}
