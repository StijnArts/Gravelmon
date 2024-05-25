package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Snipion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snipion() {
        super("Snipion",
                Type.WATER, Type.STEEL,
                new Stats(50,
                        80,
                        75,
                        40,
                        55,
                        45),
                List.of(Ability.HYPER_CUTTER), Ability.STORM_DRAIN,
                9, 165,
                new Stats(0,1,0,0,0,0), 140,
                0.875,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("After hiding itself in mud or seaweed, it remains perfectly still, waiting for something to swim close. Then, it grabs its prey and repeatedly jabs it with its sharp tail."),
                List.of(),
                List.of(                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snipion");

    }


}
