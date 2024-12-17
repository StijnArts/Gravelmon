package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ampin extends drai.dev.data.pokemon.Pokemon {
    public Ampin() {
        super("Ampin",
                Type.GROUND, Type.ELECTRIC,
                new Stats(50,
                        70,
                        40,
                        45,
                        70,
                        50),
                List.of(Ability.STATIC), Ability.LIGHTNING_ROD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It often lives near power plants and generators. When food is scarce they chew on power lines."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampin");

    }


}
