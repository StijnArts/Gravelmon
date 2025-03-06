package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Echoplasm extends drai.dev.data.pokemon.Pokemon {
    public Echoplasm(Stats stats) {
        super("Echoplasm",
                Type.GHOST, Type.ELECTRIC,
                stats,
                List.of(Ability.SHADOW_TAG), Ability.PUNK_ROCK,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 39, 56, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Echoplasm");

    }


}
