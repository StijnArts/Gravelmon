package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tublip extends drai.dev.data.pokemon.Pokemon {
    public Tublip(Stats stats) {
        super("Tublip",
                Type.POISON, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tublip, a Pokemon common in the dark trenches. In a world where life is nourished not by sunlight but by sulfur billowing from undersea volcanoes, this Poison-type Pokemon fills a niche normally held by Grass-types. It has a symbiotic relationship with Ventherm."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 21, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tublip");

    }


}
