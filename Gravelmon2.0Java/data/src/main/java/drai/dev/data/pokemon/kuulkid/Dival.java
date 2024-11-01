package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dival extends drai.dev.data.pokemon.Pokemon {
    public Dival() {
        super("Dival",
                Type.FIRE,Type.FAIRY,
                new Stats(65,
                        68,
                        42,
                        108,
                        82,
                        89),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                13, 0,
                new Stats(0,0,0,2,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 66, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dival");

    }


}
