package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pengloo extends drai.dev.data.pokemon.Pokemon {
    public Pengloo() {
        super("Pengloo",
                Type.ICE,Type.WATER,
                new Stats(108,
                        50,
                        120,
                        73,
                        89,
                        54),
                List.of(Ability.SNOWFORT), Ability.ICE_BODY,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN, Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengloo");

    }


}
