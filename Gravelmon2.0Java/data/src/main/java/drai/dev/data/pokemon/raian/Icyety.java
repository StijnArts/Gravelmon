package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Icyety extends drai.dev.data.pokemon.Pokemon {
    public Icyety(Stats stats) {
        super("Icyety",
                Type.ICE,Type.FIGHTING,
                stats,
                List.of(Ability.HUSTLE), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 57, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Icyety");

    }


}
