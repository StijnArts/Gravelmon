package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tuskoble extends drai.dev.data.pokemon.Pokemon {
    public Tuskoble(Stats stats) {
        super("Tuskoble",
                Type.DRAGON, Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tuskoble is a majestic Pokemon with hide as hard as steel, immortalized centuries ago in medieval heraldry but thought to be mere legend until recently. It has a friendly disposition and appears before those who are pure of heart. It should not be underestimated though, as it fights for justice using its massive tusks."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 54, .33, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tuskoble");

    }


}
