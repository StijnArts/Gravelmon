package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Muskraft extends drai.dev.data.pokemon.Pokemon {
    public Muskraft() {
        super("Muskraft",
                Type.WATER,
                new Stats(74,
                        62,
                        72,
                        52,
                        70,
                        70),
                List.of(Ability.THICK_FAT,Ability.STRONG_JAW), Ability.SIMPLE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Found in wetlands and marshes. Muskraft have webbed feet and thick, flattened tails that make them powerful, agile swimmers."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Muskraft");

    }


}