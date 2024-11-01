package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deepfried extends drai.dev.data.pokemon.Pokemon {
    public Deepfried() {
        super("Deepfried",
                Type.ELECTRIC,
                new Stats(62,
                        63,
                        61,
                        90,
                        83,
                        81),
                List.of(Ability.ELECTROMORPHOSIS,Ability.STATIC), Ability.LIGHTNING_ROD,
                7, 0,
                new Stats(0,0,0,2,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The metallic armour that develops on Deepfried helps them control their unstable amounts of electricity. The electrical follicles protruding from their tops are highly dangerous when touched."),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 41, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Deepfried");

    }


}
