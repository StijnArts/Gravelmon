package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Xenoscorp extends drai.dev.data.pokemon.Pokemon {
    public Xenoscorp() {
        super("Xenoscorp",
                Type.DRAGON,Type.BUG,
                new Stats(120,
                        110,
                        90,
                        100,
                        110,
                        70),
                List.of(Ability.STRONG_JAW,Ability.SUPREMEOVERLORD), Ability.GUTS,
                25, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 45, 67, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Xenoscorp");

    }


}
