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
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Deepfried");

    }


}
