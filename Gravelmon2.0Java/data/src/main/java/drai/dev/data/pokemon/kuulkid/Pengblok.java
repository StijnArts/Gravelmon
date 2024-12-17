package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pengblok extends drai.dev.data.pokemon.Pokemon {
    public Pengblok() {
        super("Pengblok",
                Type.ICE,Type.WATER,
                new Stats(74,
                        40,
                        80,
                        55,
                        66,
                        43),
                List.of(Ability.SNOWFORT), Ability.ICE_BODY,
                6, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("pengloo", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 17, 35, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN, Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengblok");

    }


}
