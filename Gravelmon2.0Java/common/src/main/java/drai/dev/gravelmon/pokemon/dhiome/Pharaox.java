package drai.dev.gravelmon.pokemon.dhiome;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Pharaox extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pharaox() {
        super("Pharaox",
                Type.FIRE,
                new Stats(85,
                        105,
                        85,
                        85,
                        65,
                        110),
                List.of(Ability.BLAZE), Ability.SIMPLE,
                17, 916,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its fiery energy is said to compare with that of the Sun. Should it consider its opponent strong, it will unleash its full power."),
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
           setLangFileName("Pharaox");

    }


}
