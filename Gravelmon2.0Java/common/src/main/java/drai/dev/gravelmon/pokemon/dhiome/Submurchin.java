package drai.dev.gravelmon.pokemon.dhiome;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Submurchin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Submurchin() {
        super("Submurchin",
                Type.DARK, Type.STEEL,
                new Stats(95,
                        95,
                        90,
                        50,
                        135,
                        32),
                List.of(Ability.IRON_BARBS), Ability.STURDY,
                0, 2018,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Though hard as steel, its spikes are so sensitive to movement that a fast current might cause them to explode."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Submurchin");

    }


}
